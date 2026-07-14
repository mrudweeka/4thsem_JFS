
import java.util.*;

class CountEdges {
    public static void main(String args[]) {

        // Adjacency List representation
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1,3));
        graph.put(1, Arrays.asList(0,2,3));
        graph.put(2, Arrays.asList(1,4));
        graph.put(3, Arrays.asList(0,1,4));
        graph.put(4, Arrays.asList(2,3));

        int edgeCount = 0;

        for(Integer vertex : graph.keySet()) {
            edgeCount += graph.get(vertex).size();
        }

        System.out.println("No of edges in the graph = " + (edgeCount / 2));
        System.out.println("No of vertices in the graph = " + graph.size());
    }
}
