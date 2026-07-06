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
    Map<Node, Node> oldVsNew = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        if(oldVsNew.containsKey(head)) return oldVsNew.get(head);

        Node copy = new Node(head.val);
        oldVsNew.put(head, copy);
        copy.next = copyRandomList(head.next);
        copy.random = oldVsNew.get(head.random);
        return copy;
        
    }
}
