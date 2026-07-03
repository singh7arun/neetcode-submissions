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
    public void reorderList(ListNode head) {
        if (head == null) return;
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            nodes.add(curr);
            curr = curr.next;
        }
        int n = nodes.size()-1;
        head.next = nodes.get(n);
        head = head.next;
        n--;
        for (int i = 1; i < nodes.size()/2; i++){
            head.next = nodes.get(i);
            head = head.next;
            head.next = nodes.get(n);
            n--;
            head = head.next;
        }

        if (nodes.size() % 2 != 0){
            head.next = nodes.get(nodes.size() / 2);
            head = head.next;
        }
        head.next = null;
    }
}
