class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length -1;

        while (r-l > 1){
            int k = (r + l)/2;

            if (nums[k] < nums[l]){
                r = k;
            } else if (nums[k] > nums[r]){
                l = k;
            } else return nums[0];
        }
        return nums[l] > nums[r] ? nums[r] : nums[l];
        
    }
}
