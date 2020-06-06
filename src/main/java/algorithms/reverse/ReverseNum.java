package algorithms.reverse;

import java.util.Arrays;
import java.util.List;

public class ReverseNum {


    public void reverseList(){
        List<Integer> l = Arrays.asList(7, 4, 23, 1, 4, 6, 34, 3, 76, 8, 10);
        for(int i = l.size()-1; i >= 0; i--){
            System.out.println("Reversed " + l.get(i));
        }
    }

    public void revertInteger(){

    }
}
