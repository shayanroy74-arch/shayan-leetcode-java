/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        HashMap<Integer, Node> visited = new HashMap<>();

        Node fnode = new Node(node.val);
        visited.put(node.val, fnode);
        Queue<Node> qm = new LinkedList<>();
        Queue<Node> qd = new LinkedList<>();
        qm.offer(node);
        qd.offer(fnode);

        while (!qm.isEmpty()) {
            Node curr = qm.poll();
            Node c = qd.poll();            
                    ArrayList<Node> neighbors = new ArrayList<>();
                    for (int i = 0; i < curr.neighbors.size(); i++) {
                        Node originalNeighbor = curr.neighbors.get(i);
                        if (!visited.containsKey(originalNeighbor.val)) {
                            Node neighbor = new Node(originalNeighbor.val);
                            visited.put(curr.neighbors.get(i).val,neighbor);
                            
                            qm.offer(curr.neighbors.get(i));
                            qd.offer(neighbor);
                        }
                        neighbors.add(visited.get(originalNeighbor.val));
                        

                    }
                    c.neighbors = new ArrayList<>(neighbors);
        }

        return fnode;
    }
}

