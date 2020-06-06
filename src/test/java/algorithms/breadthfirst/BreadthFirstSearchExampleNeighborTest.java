package algorithms.breadthfirst;

import algorithms.breadthfirst.search.BreadthFirstSearchExampleNeighbourList;
import algorithms.breadthfirst.search.Node;
import org.junit.Test;

public class BreadthFirstSearchExampleNeighborTest {
    @Test
    public void bfsTest(){
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        BreadthFirstSearchExampleNeighbourList bfsExample = new BreadthFirstSearchExampleNeighbourList();
        bfsExample.bfs(node40);
    }
}
