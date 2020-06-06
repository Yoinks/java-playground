package threading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MonsterWorker implements Runnable {

    Logger LOGGER = LogManager.getLogger(MonsterWorker.class);

    private final Integer threadIndex;

    public MonsterWorker(Integer count) {
        this.threadIndex = count;
    }

    @Override
    public void run() {
//        LOGGER.debug(Thread.currentThread().getName() + " START: WORKING SUPER HARD " + threadIndex);
        System.out.println(Thread.currentThread().getName() + " START: WORKING SUPER HARD " + threadIndex);
        try {
            //TODO implement some activity you want the thread to perform
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " END: WORKING SUPER HARD " + threadIndex);
//        LOGGER.debug(Thread.currentThread().getName() + " END: WORKING SUPER HARD " + threadIndex);
    }

    @Override
    public String toString() {
        return "MonsterWorker{" +
                "threadIndex=" + threadIndex +
                '}';
    }
}
