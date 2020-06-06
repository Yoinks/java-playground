package threading;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;


public class RejectionHandler implements RejectedExecutionHandler {

    Logger LOGGER = LogManager.getLogger(RejectionHandler.class);

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString()+" is rejected ");
//        LOGGER.debug(r.toString()+" is rejected ");
    }
}
