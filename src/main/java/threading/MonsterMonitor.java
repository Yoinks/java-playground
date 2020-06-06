package threading;

import java.util.concurrent.ThreadPoolExecutor;

public class MonsterMonitor implements Runnable {

    private boolean run = true;
    private int delayInSeconds;
    private ThreadPoolExecutor threadPoolExecutor;

    public MonsterMonitor(int delayInSeconds, ThreadPoolExecutor threadPoolExecutor) {
        this.delayInSeconds = delayInSeconds;
        this.threadPoolExecutor = threadPoolExecutor;
    }

    @Override
    public void run() {
        while(run){
            System.out.println("Thread Monitor");
            System.out.println("Active Count: " + this.threadPoolExecutor.getActiveCount());
            System.out.println("Maximum Pool Size: " + this.threadPoolExecutor.getMaximumPoolSize());
            System.out.println("Core Pool Size: " + this.threadPoolExecutor.getCorePoolSize());
            System.out.println("Task Count : " + this.threadPoolExecutor.getTaskCount());
            System.out.println("Is Shutdown: " + this.threadPoolExecutor.isShutdown());
            System.out.println("Is Terminated: " + this.threadPoolExecutor.isTerminated());


            try {
                Thread.sleep(delayInSeconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.run = false;
    }
}
