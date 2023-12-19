import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.CountDownLatch;

@AllArgsConstructor
@Getter
public class PhilosopherThread extends Thread {
    private final Philosopher philosopher;

    private void haveLunch() throws InterruptedException {
        sleep(500);
        philosopher.haveLunch();
    }

    @Override
    public void run() {
        try {
            while (philosopher.getTimes() != 3) {
                haveLunch();
                philosopher.ponder();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
