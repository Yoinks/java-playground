package threading;

import org.junit.Test;
import threading.ThreadMonster;

public class ThreadMonsterTest {

    @Test
    public void testThreadMonster() throws InterruptedException {
        new ThreadMonster().exec();
    }
}
