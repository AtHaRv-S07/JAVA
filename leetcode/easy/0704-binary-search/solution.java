class Solution {
    public int search(int[] nums, int target) {
        int first=0,last=nums.length-1;
        while(first<=last){
        int mid=(first+last)/2;
        
        if(nums[mid]==target){
            return nums[mid];
        }
        else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return -1;
    }
}