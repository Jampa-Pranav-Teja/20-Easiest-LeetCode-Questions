class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] c = new int[2*n];
        for(int i=0; i<n; i+=1){
            c[2*i] = nums[i];
            c[2*i+1] = nums[i+n];
        }
        return c;
    }
}