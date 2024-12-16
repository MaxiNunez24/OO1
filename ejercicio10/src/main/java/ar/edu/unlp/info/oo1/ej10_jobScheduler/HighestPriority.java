package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class HighestPriority extends JobScheduler {
    public HighestPriority() {
        super();
    }

    public JobDescription getNext(){
        JobDescription nextJob = this.jobs.stream()
                .max((j1, j2) ->Integer.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
        return nextJob;
    }

}
