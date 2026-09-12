/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        var oldToCopy = new HashMap<Node, Node>();
        var cur = head;
        while (cur!=null){
            var copy = new Node(cur.val);
            oldToCopy.put(cur, copy);
            cur = cur.next;
        }

        cur = head;
        while(cur!=null){
            var newNode = oldToCopy.get(cur);
            newNode.next = oldToCopy.get(cur.next);
            newNode.random=oldToCopy.get(cur.random);
            cur = cur.next;
        }

        return oldToCopy.get(head);
    }
}
