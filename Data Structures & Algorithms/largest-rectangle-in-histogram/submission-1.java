class Solution {
    public int largestRectangleArea(int[] heights) {

        int area = 0;

        int n = heights.length;

        for (int i = 0; i < n; i++){
            
            int rightMost = i + 1;

            while ((rightMost) < n && heights[rightMost] >= heights[i]){
                rightMost++;
            }

            int leftMost = i - 1;

            while ((leftMost) >=  0 && heights[leftMost] >= heights[i]){
                leftMost--;
            }
            rightMost--;
            leftMost++;
            area = Math.max(area, ((rightMost - leftMost) + 1) * heights[i]);
        }
        return area;
    }
}
