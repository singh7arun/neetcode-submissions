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
        Map<Node, Node> oldVsNew = new HashMap<>();

        Node curr = head;
        while(curr != null){
            oldVsNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null){
            Node copy = oldVsNew.get(curr);
            copy.next = oldVsNew.get(curr.next);
            copy.random = oldVsNew.get(curr.random);
            curr = curr.next;
        }
        return oldVsNew.get(head);
    }
}
