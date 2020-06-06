package threading;

import org.apache.log4j.BasicConfigurator;

import java.util.concurrent.*;

public class ThreadMonster {

    final int corePoolSize = 2;
    final int maxPoolSize = 5;
    final int keepAliveTime = 10;
    final int queSize = 3;

    public void exec() throws InterruptedException {
        BasicConfigurator.configure();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queSize),
                Executors.defaultThreadFactory(),
                new RejectionHandler());

        MonsterMonitor monsterMonitor = new MonsterMonitor(maxPoolSize, poolExecutor);
        Thread thread = new Thread(monsterMonitor);
        thread.start();

        for(int i = 0; i < 10; i ++) {
          poolExecutor.execute(new MonsterWorker(i));
        }

        Thread.sleep(2000);
        poolExecutor.shutdown();
        Thread.sleep(4000);
        monsterMonitor.shutdown();
    }
}
