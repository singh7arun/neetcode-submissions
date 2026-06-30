class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        int pivot = findPivot(nums);

        if (nums[pivot] <= target && target <= nums[r]){
            return binarySearck(pivot, r, nums, target);
        } else if (pivot > 0 && nums[0] <= target && target <= nums[pivot-1]){
             return binarySearck(0, pivot-1, nums, target);
        } else {
            return -1;
        }
    }

    private int binarySearck(int l, int r, int[] nums, int target){
        while (l <= r){
            int k = (l+r)/2;
            if (nums[k] == target) return k;

            if (nums[k] > target){
                return binarySearck(l, k-1, nums, target);
            } else {
                return binarySearck(k+1, r, nums, target);
            }
        }
        return -1;
    }

    private int findPivot(int[] nums) {

        int l = 0;
        int r = nums.length -1;

        while (r-l > 1){
            int k = (r + l)/2;

            if (nums[k] < nums[l]){
                r = k;
            } else if (nums[k] > nums[r]){
                l = k;
            } else return 0;
        }
        return nums[l] > nums[r] ? r : l;
        
    }
}
