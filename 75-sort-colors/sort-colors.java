class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=0;
        for(int num : nums){
            if(num==0) i++;
            else if(num==1) j++;
            else k++;
        }
        int c=0;
        while(i>0){
            nums[c]=0;
            i--;
            c++;
        }
         while(j>0){
            nums[c]=1;
            j--;
            c++;
        }
         while(k>0){
            nums[c]=2;
            k--;
            c++;
        }
    }
}