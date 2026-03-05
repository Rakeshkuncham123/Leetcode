class Solution {
    public int minOperations(String s) {
        int  c0=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(i%2==0?'0':'1')){
                c0++;
            }
            if(s.charAt(i)!=(i%2==0?'1':'0')){
                c1++;
            }
        }
        return Math.min(c0,c1);
    }
}