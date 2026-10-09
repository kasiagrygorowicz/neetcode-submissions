/*
Definition for a Node.
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
        if (node == null) return null;
        var cloned = new HashMap<Node,Node>();
        dfs(cloned, node);
        return cloned.get(node);



    }

    private void dfs(Map<Node,Node> cloned, Node node){
        var newNode = new Node(node.val);
        cloned.put(node, newNode);
        for(Node n : node.neighbors){
            if(!cloned.containsKey(n)){
                dfs(cloned, n);
            }
            newNode.neighbors.add(cloned.get(n));
            }
        



    }
}