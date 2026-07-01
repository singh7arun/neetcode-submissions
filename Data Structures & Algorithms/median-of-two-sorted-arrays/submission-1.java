class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int medianIndex =  (m + n)/2;

        int median1 = 0;
        int median2 = 0;

        int i = 0;
        int j = 0;

        for (int count = 0; count < medianIndex + 1; count++){
            median2 = median1;
            if ( i < m && j < n){
                if (nums1[i] < nums2[j]){
                    median1 = nums1[i];
                    i++;
                } else {
                    median1 = nums2[j];
                    j++;
                } 
            } else if (i < m){
                median1 = nums1[i];
                i++;
            } else {
                median1 = nums2[j];
                j++;
            }
        }

        if ((m+n) %2 !=0){
            return median1;
        } else {
            return (double) (median1 + median2) / 2 ;
        }
        
    }
}
