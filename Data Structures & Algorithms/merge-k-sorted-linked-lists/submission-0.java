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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode list = new ListNode(Integer.MAX_VALUE);
        ListNode curr = list;

        while (true){
            boolean nextNodeFound = false;
            ListNode nextNode = new ListNode(Integer.MAX_VALUE);
            int index = 0;
            for (int i = 0; i < lists.length; i++){
                if (lists[i] != null && lists[i].val < nextNode.val){
                    nextNode = lists[i];
                    index = i;
                    nextNodeFound = true;
                }
            }
            if (nextNodeFound){
                list.next = nextNode;
                list = list.next;
                lists[index] = lists[index].next;
            } else {
                break;
            }
        }
        return curr.next;
    }
}
