class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                c++;
            }
        }
        return c;
    }
}
