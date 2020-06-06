package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    private static final int PLAYGROUND_THREADS =2 ;

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(PLAYGROUND_THREADS);

        executorService.execute(new MessageProcessor(100));
        executorService.execute(new MessageProcessor(300));
        executorService.execute(new MessageProcessor(500));
        executorService.execute(new MessageProcessor(400));
        executorService.execute(new MessageProcessor(900));
        executorService.execute(new MessageProcessor(700));
        executorService.execute(new MessageProcessor(200));
        executorService.execute(new MessageProcessor(500));
        executorService.execute(new MessageProcessor(800));
        executorService.execute(new MessageProcessor(900));
    }
}
