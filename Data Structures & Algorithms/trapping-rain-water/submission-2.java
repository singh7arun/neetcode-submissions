class Solution {
    public int trap(int[] height) {
        int lastBarHeight = 0;
        int peakBarIndex = 0;       
        int water = 0;
        int currentWater = 0;       
        int len = height.length;
        for (int i =0; i < len; i ++){
            if (lastBarHeight > height[i]){               
                currentWater = currentWater + lastBarHeight - height[i];              
            } else {
                peakBarIndex = i;
                water = water + currentWater;
                currentWater = 0;
                lastBarHeight = height[i];                
            } 
        }
        lastBarHeight = 0;       
        currentWater = 0;    
        for (int i =len-1; i >= peakBarIndex; i --){
            if (lastBarHeight > height[i]){               
                currentWater = currentWater + lastBarHeight - height[i];              
            } else {
                water = water + currentWater;
                currentWater = 0;
                lastBarHeight = height[i];                
            } 
        }
        return water;
    }
}