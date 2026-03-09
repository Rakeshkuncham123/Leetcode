class Solution {
    public int findGCD(int[] nums) {
        int m=Integer.MAX_VALUE;
        int M=Integer.MIN_VALUE;
        for(int num : nums){
            m=Math.min(m,num);
            M=Math.max(M,num);
        }
        return gcd(m,M);
    }
    public int gcd(int m,int M){
        while(M!=0){
            int temp=M;
            M=m%M;
            m=temp;
        }
        return m;
    }
}