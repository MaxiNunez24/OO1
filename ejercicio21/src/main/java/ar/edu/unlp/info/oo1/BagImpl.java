package ar.edu.unlp.info.oo1;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<T, Integer>();
    }

    @Override
    public boolean add(T element) {
        if(elements.containsKey(element)) {
            int aux = Integer.parseInt(String.valueOf(elements.get(element)));
            elements.put(element, aux + 1);
        }else {
            elements.put(element, 1);
        }
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        return elements.get(element);
    }

    @Override
    public void removeOccurrence(T element) {
        if(elements.containsKey(element)){
            int aux = Integer.parseInt(String.valueOf(elements.get(element)));
            int i = aux > 0 ? aux += -1 : aux;
            elements.replace(element, i);
        }
    }

    @Override
    public void removeAll(T element) {
        if(elements.containsKey(element)){
            elements.remove(element);
        }
    }

    @Override
    public int size() {
        if(elements.isEmpty())return 0;
        return elements.values().stream().mapToInt(i -> i).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
