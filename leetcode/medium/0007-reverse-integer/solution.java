class Solution {
    public int reverse(int x) {
        int sum = 0, p,n;
        
        while (x != 0) {
            p = x % 10;
            x = x / 10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
            }

            sum = sum * 10 + p;
        }
        return sum;
    }

}
