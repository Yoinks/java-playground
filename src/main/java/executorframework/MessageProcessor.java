package executorframework;

import org.apache.log4j.Logger;

public class MessageProcessor implements Runnable {
    private int message;

    final static Logger log = Logger.getLogger(MessageProcessor.class);

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
//        log.debug(Thread.currentThread().getName() + "[RECEIVED MESSAGE] " + message);
        System.out.println(Thread.currentThread().getName() + "[RECEIVED MESSAGE] " + message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName() + "[DONE] Processing Message " + message);
//        log.debug(Thread.currentThread().getName() + "[DONE] Processing Message " + message);
    }

    private void respondToMessage(){
        try {
            System.out.println("IS THIS EVEN SLEEPING");
            Thread.sleep(10000);
            System.out.println("WHAT IS GOING ON HERE");
        } catch (InterruptedException e) {
            System.out.println("DERP DERP DERP");
            log.fatal("Unable to process message " + message);
        }
    };
}
