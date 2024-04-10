import java.util.*;

public class DijkstraAlgorithm {

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        Map<String, Integer> shortestPaths = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));
        priorityQueue.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!priorityQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = priorityQueue.poll();
            String currentNode = entry.getKey();
            int currentDistance = entry.getValue();

            shortestPaths.put(currentNode, currentDistance);

            for (Map.Entry<String, Integer> neighbor : graph.get(currentNode).entrySet()) {
                int distance = currentDistance + neighbor.getValue();
                if (distance < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), distance);
                    priorityQueue.add(new AbstractMap.SimpleEntry<>(neighbor.getKey(), distance));
                }
            }
        }

        return shortestPaths;
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", new HashMap<>());
        graph.put("B", new HashMap<>());
        graph.put("C", new HashMap<>());
        graph.put("D", new HashMap<>());
        graph.put("E", new HashMap<>());

        graph.get("A").put("B", 4);
        graph.get("A").put("C", 2);
        graph.get("B").put("C", 5);
        graph.get("B").put("D", 10);
        graph.get("C").put("D", 3);
        graph.get("D").put("E", 7);

        String startNode = "A";
        Map<String, Integer> shortestPaths = dijkstra(graph, startNode);

        System.out.println("Shortest paths from node " + startNode + ":");
        for (Map.Entry<String, Integer> entry : shortestPaths.entrySet()) {
            System.out.println("Node: " + entry.getKey() + " - Distance: " + entry.getValue());
        }
    }
}