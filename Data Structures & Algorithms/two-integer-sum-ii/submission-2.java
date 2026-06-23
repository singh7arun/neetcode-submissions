class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = 1;
        int[] output = new int[2];
        while (numbers[i] + numbers[j] != target){
            if (numbers[i] + numbers[j] < target){
                j++;
                if (j >= numbers.length){
                    i++;
                    j = i+1;
                }
            } else if (numbers[i] + numbers[j] > target){
                i++;
                j = i+1;
            }
            if (i == j){
                j++;
            }
        } 
        output[0] = i+1;
        output[1] = j+1;
        return output;
        
    }
}
