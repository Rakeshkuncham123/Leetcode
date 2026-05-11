class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            while(num>0){
                int d=num%10;
                res.add(d);
                num=num/10;
            }
        }
        int[] ans=new int[res.size()];
        int n=ans.length-1;
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(n);
            n--;
        }
        return ans;
    }
}