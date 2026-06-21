class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++){
            if (product == 0){
                    output[i] = 0;
                    continue;
                }
            if (i == nums.length -1 ){
                    output[i] = product;
                    continue;
                }
            int forwardProduct = 1;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == 0){
                    forwardProduct = 0;
                    break;
                }
                forwardProduct = forwardProduct * nums[j];
            }
                output[i] = forwardProduct * product;

            product = product * nums[i];
        }
        return output;
        
    }
}  
