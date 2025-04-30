public class Descuento10PorcientoParaCafeFrio implements Promocion{
    @Override
    public void aplicarDescuento(Bag<Producto> productos) {
        // productos.stream().filter(producto -> producto.getNombre().toLowerCase().equals("Cafe"))
    }
}
