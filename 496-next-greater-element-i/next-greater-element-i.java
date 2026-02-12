class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   res[i]= check(nums2,nums1[i],j);

                }
            }
        }
        return res;
    }
    public int check(int[] nums2,int e,int j){
        int s=j+1;
        while(s<nums2.length){
            if(e<nums2[s]) return nums2[s];
            s++;
        }
        return -1;
    }
}