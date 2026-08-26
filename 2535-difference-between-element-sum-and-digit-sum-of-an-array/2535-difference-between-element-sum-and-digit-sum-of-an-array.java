class Solution {
    public int digis(int n){
        int s = 0;
        while(n > 0){
            s += n%10;
            n/=10;
        }
        return s;
    }
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digsum = 0;
        for(int num: nums){
            sum+=num;
            digsum+=digis(num);
        }
        return sum - digsum;
    }
}