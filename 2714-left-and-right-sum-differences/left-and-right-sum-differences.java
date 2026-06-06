class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int rsum[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rsum[i]=nums[i];
            }else{
                rsum[i]=rsum[i+1]+nums[i];
            }
        }
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
         
        for(int i=0;i<n;i++){
            if(i==0 && n>1){
                left[i]=0;
                right[i]=rsum[i+1];
            }
            else if(i!=0 && i!=n-1){
                left[i]=nums[i-1];
                right[i]=rsum[i+1];
            }
            else if(i==n-1 && n>1){
                left[i]=nums[i-1];
                right[i]=0;
            }
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
    }
}