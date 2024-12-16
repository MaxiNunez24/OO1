package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerEnunciadoTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobSchedulerEnunciado newFifoScheduler() {
        JobSchedulerEnunciado fifoScheduler = new JobSchedulerEnunciado();
        fifoScheduler.setStrategy("FIFO");
        return fifoScheduler;
    }

    private JobSchedulerEnunciado newLifoScheduler() {
        JobSchedulerEnunciado lifoScheduler = new JobSchedulerEnunciado();
        lifoScheduler.setStrategy("LIFO");
        return lifoScheduler;
    }

    private JobSchedulerEnunciado newPriorityScheduler() {
        JobSchedulerEnunciado priorityScheduler = new JobSchedulerEnunciado();
        priorityScheduler.setStrategy("HighestPriority");
        return priorityScheduler;
    }

    private JobSchedulerEnunciado newEffortScheduler() {
        JobSchedulerEnunciado effortScheduler = new JobSchedulerEnunciado();
        effortScheduler.setStrategy("MostEffort");
        return effortScheduler;
    }

    private void scheduleJobsIn(JobSchedulerEnunciado aJobSchedulerEnunciado) {
        aJobSchedulerEnunciado.schedule(firstJob);
        aJobSchedulerEnunciado.schedule(highestPriorityJob);
        aJobSchedulerEnunciado.schedule(mostEffortJob);
        aJobSchedulerEnunciado.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobSchedulerEnunciado aScheduler = new JobSchedulerEnunciado();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobSchedulerEnunciado aScheduler = new JobSchedulerEnunciado();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobSchedulerEnunciado scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
