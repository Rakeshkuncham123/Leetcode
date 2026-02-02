class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        
        for(int num : nums){
            hs.add(num);
            

        }
        int longest=0;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int current=num;
                int streak=1;
                while(hs.contains(current+1)){
                    current++;
                    streak++;
                }
                longest=Math.max(longest,streak);
            }
        }
        return longest;
    }
}