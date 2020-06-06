package algorithms.breadthfirst.search;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchExampleNeighbourList {
    public void bfs(Node node) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        node.visited=true;
        while (!queue.isEmpty())
        {
            Node element=queue.remove();
            System.out.print(element.data + " -> ");
            List<Node> neighbours=element.getNeighbours();
            neighbours.forEach(n -> {
                if(n!=null && !n.visited)
                {
                    queue.add(n);
                    n.visited=true;
                }
            });
        }
    }
}
