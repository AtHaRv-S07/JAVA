    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int max=1;
       int current=1;
       for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
               current++;
           }
           else{
               current=1;
           }
           max=Math.max(max,current);
       }
       return max;
    }
