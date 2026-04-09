class Solution {
    public int findNonMinOrMax(int[] nums) {
        int m=nums[0];
        int M=nums[0];
        for(int i=1;i<nums.length;i++){
            if(m>nums[i]) m=nums[i];
            if(M<nums[i]) M=nums[i];
        }
        if(nums.length<=2) return -1;
        int res=0;
        for(int i=0;i<3;i++){
            if(nums[i]!=m && nums[i]!=M) {
                res=nums[i];
                break;
            }    
        }
        return res;
    }
}