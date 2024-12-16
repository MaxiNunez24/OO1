package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFO extends JobScheduler {
    public FIFO() {
        super();
    }

    public JobDescription getNext() {
        return this.jobs.get(0);
    }


}
