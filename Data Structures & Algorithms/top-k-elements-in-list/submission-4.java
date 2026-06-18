class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        Arrays.fill(output,1001);
       
        for (int i = 0; i < k; i ++){
            int no = getMostFrequentNumber(nums, output);
            output[i] = no;
        }

        return output;
    }

    private int getMostFrequentNumber(int[] nums, int[] output){
        int n = nums.length;
        int mostFrequentNo = 1001;
        int maxCount = 0;

        for (int i = 0; i < n; i++){
            int count = 0;
            if (!containsNumber(output, nums[i])){
            for (int j = 0; j < n; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > maxCount && nums[i] != mostFrequentNo){
                maxCount = count;
                mostFrequentNo = nums[i];
            }
            }

        }
        return mostFrequentNo;
    }

    private boolean containsNumber(int[] arr, int k){
        boolean present = false;
        for (int i = 0; i < arr.length; i++){
            if (k == arr[i]){
                present = true;
                break;
            }
        }
        return present;
    }
}
