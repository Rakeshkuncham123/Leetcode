class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int val=nums[0];
        int c=0;
        int l=nums.length;
        for(int key : freq.keySet()){
            if(freq.get(key)>c){
                c=freq.get(key);
                //val=key;
                l=subArray(nums,0,nums.length-1,key);
            }else if(freq.get(key)==c && subArray(nums,0,nums.length-1,key)<l){
                //val=key;
                l=subArray(nums,0,nums.length-1,key);
            }
        }
        
        return l;
    }
    public int subArray(int[] nums,int i,int j,int val){
        
        while(i<j){
            if(nums[i]==val) break;
            else i++;
            //System.out.print(i+" ");
        }
        while(j>i){
            if(nums[j]==val) break;
            else j--;
            //System.out.print(j+" ");
        }
        return ((j-i)+1);
    }
}