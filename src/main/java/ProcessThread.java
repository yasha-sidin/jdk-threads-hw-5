import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProcessThread extends Thread {
    private List<PhilosopherThread> philosopherThreads;

    @Override
    public void run() {
        for (PhilosopherThread philosopherThread: philosopherThreads) {
            philosopherThread.start();
        }
    }
}
