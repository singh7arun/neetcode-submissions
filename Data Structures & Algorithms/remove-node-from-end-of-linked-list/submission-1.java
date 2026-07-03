/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            nodes.add(curr);
            curr = curr.next;
        }

        if (nodes.size() > n){
            ListNode node = nodes.get(nodes.size() - n - 1);
            node.next = node.next.next;
            return head;
        } 
        return head.next;

    }
}
