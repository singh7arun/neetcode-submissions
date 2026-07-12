class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        Deque<ListNode> stack = new ArrayDeque<>();

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode curr = head;

        while (curr != null) {

            int count = 0;
            ListNode temp = curr;

            // Push k nodes
            while (temp != null && count < k) {
                stack.push(temp);
                temp = temp.next;
                count++;
            }

            // Less than k nodes left
            if (count < k) {
                tail.next = curr;
                break;
            }

            // Pop and reverse
            while (!stack.isEmpty()) {
                tail.next = stack.pop();
                tail = tail.next;
            }

            // Connect to next group
            tail.next = temp;

            curr = temp;
        }

        return dummy.next;
    }
}