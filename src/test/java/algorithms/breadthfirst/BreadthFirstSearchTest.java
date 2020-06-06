package algorithms.breadthfirst;

import algorithms.breadthfirst.traversal.StateNode;
import org.junit.Test;
import java.util.Arrays;

public class BreadthFirstSearchTest {

    @Test
    public void dataTest(){
        //Doesn't work
        StateNode az = StateNode.builder().nodeName("Arizona").build();
        StateNode cal = StateNode.builder().nodeName("California").build();
        StateNode nm = StateNode.builder().nodeName("New Mexico").build();
        StateNode co = StateNode.builder().nodeName("Colorado").build();
        StateNode io = StateNode.builder().nodeName("Idaho").build();
        StateNode uh = StateNode.builder().nodeName("Utah").build();
        StateNode na = StateNode.builder().nodeName("Nevada").build();
        StateNode on = StateNode.builder().nodeName("Oregon").build();

        cal.setChildren(Arrays.asList(az,on,na));
        az.setChildren(Arrays.asList(cal,co,na,nm,uh));

        System.out.println();
    }

    @Test
    public void data2Test(){

    }

}
