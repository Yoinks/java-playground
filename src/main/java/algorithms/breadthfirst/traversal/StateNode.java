package algorithms.breadthfirst.traversal;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StateNode {
    private String nodeName;
    private boolean visited;
    private List<StateNode> children;
}
