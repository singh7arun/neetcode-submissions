class Solution {
    public int largestRectangleArea(int[] heights) {

        int area = 0;

        int n = heights.length;

        for (int i = 0; i < n; i++){
            
            int rightMost = i;

            while ((rightMost + 1) < n && heights[rightMost + 1] >= heights[i]){
                rightMost++;
            }

            int leftMost = i;

            while ((leftMost - 1) >=  0 && heights[leftMost - 1] >= heights[i]){
                leftMost--;
            }

            area = Math.max(area, ((rightMost - leftMost) + 1) * heights[i]);
        }
        return area;
    }
}
