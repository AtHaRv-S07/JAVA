class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m=nums1.length,n=nums2.length;
        int l=m+n;
        int nums3[]=new int[l];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            nums3[m + i] = nums2[i];
        }

        double median;
        if((m+n)%2==0)
        {
            median=(nums3[(l/2)-1]+nums3[l/2])/2.0;
        }
        else{
            median=nums3[(l+1)/2];
        }
        return median;
    }
}