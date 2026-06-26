class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++){
            int days = 0;
            int j = i+1;
            while(j < temperatures.length){
                if (temperatures[j] > temperatures[i]){
                    days = j - i;
                    break;
                }
                j++;
            }
            res[i] = days;
        }
        return res;
    }
}
