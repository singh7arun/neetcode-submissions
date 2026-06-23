class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int maxWater = 0;

        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                int vol = (j-i)* Math.min(heights[i], heights[j]);
                if (vol > maxWater){
                    maxWater = vol;
                }
            }

        }
        return maxWater;
    }
}
