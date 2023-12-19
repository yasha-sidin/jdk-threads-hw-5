import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PhilosopherThread> philosopherThreads = List.of(
                new PhilosopherThread(new Philosopher("Jake")),
                new PhilosopherThread(new Philosopher("Kate")),
                new PhilosopherThread(new Philosopher("Egor")),
                new PhilosopherThread(new Philosopher("Mark")),
                new PhilosopherThread(new Philosopher("Jacob"))
        );
        ProcessThread processThread = new ProcessThread(philosopherThreads);
        processThread.start();
    }
}
