package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class MostEffort extends JobScheduler{

    public MostEffort(){
        super();
    }

    public JobDescription getNext(){
        JobDescription nextJob = this.jobs.stream()
                .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
        return nextJob;
    }

}
