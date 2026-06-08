class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int ans[] = new int[n];
       
       
        int i = 0 ,left=0;
        int j = n-1,right=n-1;

        while(left <n ){
            if(nums[left] < pivot){
                ans[i] = nums[left];
                i++;
            }
            
            if(nums[right] > pivot){
                ans[j--] = nums[right];
            }
            left++;
            right--;
           
           
        }
        for(int a=i;a<=j;a++){
            ans[a] = pivot;
        }
        return ans;
    }
}