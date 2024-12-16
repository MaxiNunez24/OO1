package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class LIFO extends JobScheduler{

    public LIFO() {
        super();
    }

    public JobDescription getNext() {
        return this.jobs.get(this.jobs.size()-1);
    }

}
