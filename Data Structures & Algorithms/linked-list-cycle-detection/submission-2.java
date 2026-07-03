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

        while(true){
            ListNode node = head.next;
            if (node == null){
                return false;
            } else {
                if (list.contains(node)){
                    return true;
                }                
            }
            list.add(node);
            head = head.next;
        }
    }
}
