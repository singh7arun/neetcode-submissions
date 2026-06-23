class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;
        int peakHeightIndex = 0;
        int lastHeightIndex = 0;
        int tempWater = 0;
        int water = 0;

        for (int i =0; i < n ; i++){
            if (height[i] >= height[lastHeightIndex]){
                lastHeightIndex = i;
                water = water + tempWater;
                tempWater = 0;
                if (height[i] >= height[peakHeightIndex]){
                    peakHeightIndex = i;
                }
            } else {
                tempWater = tempWater + (height[lastHeightIndex] - height[i]);
            }
        }

        lastHeightIndex = n-1;
        tempWater = 0;
        for (int i = n-1 ; i >=peakHeightIndex; i--){
            if (height[i] >= height[lastHeightIndex]){
                lastHeightIndex = i;
                water = water + tempWater;
                tempWater = 0;
            } else {
                tempWater = tempWater + (height[lastHeightIndex] - height[i]);
            }
        }
        return water;
    }
}