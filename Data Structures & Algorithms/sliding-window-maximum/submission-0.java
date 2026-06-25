class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[(nums.length-k) + 1];
        if (nums == null || nums.length == 0 || k <= 0) return result;

        // Stores indices of elements
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // 1. Remove indices that are out of the current window bounds
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 2. Remove elements from the back that are smaller than the incoming element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // 3. Add current element's index to the back
            deque.offerLast(i);

            // 4. The window is fully formed once our index hits (k - 1)
            if (i >= k - 1) {
                result[(i-k)+1] = nums[deque.peekFirst()];
                // result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }
}
