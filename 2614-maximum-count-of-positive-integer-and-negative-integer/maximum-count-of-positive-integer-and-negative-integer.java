class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0,m=-1;
        for(int i=0;i<=nums.length-1;i++) {
            if(nums[i]>0) pos++;
            else if(nums[i]<0) neg++;
            else continue;

        }
        m=Math.max(pos,neg);
        return m;



        
    }
}