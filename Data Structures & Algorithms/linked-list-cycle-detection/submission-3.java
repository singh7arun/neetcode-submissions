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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        List<ListNode> list = new ArrayList<>();
        list.add(head);

        while(head != null){
            ListNode node = head.next;
            if (list.contains(node)){
                return true;
            }                
            list.add(node);
            head = head.next;
        }
        return false;
    }
}
