class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0 ) return 0;
        nums = selectionSort(nums);
        int maxSeq = 1;
        int tempMaxSeq = 1;
        for (int i =1; i < n; i++){
            if (nums[i] - nums[i-1] == 1){
                tempMaxSeq++;
            } else if (nums[i] == nums[i-1]) {
                continue;
            }
            else {
                if (tempMaxSeq > maxSeq){
                    maxSeq = tempMaxSeq;
                }
                tempMaxSeq = 1;
            }
        }

        return tempMaxSeq > maxSeq ? tempMaxSeq : maxSeq;
        
    }

    private int[] selectionSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++){
        int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
                   
                
            }
             int temp  = nums[minIndex];
            nums[minIndex] = nums[i];
                    nums[i] = temp;


        }
        print(nums);
        return nums;

    }

    private void print(int[] nums){
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
