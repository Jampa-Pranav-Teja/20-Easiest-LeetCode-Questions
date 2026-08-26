class Solution {
    public int countDigits(int num) {
        int i = num;
        int count = 0;
        while(i > 0){
            int rem = i%10;
            if(num%rem == 0){
                count++;
            }
            i/=10;
        }
        return count;
    }
}