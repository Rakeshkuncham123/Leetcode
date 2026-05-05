class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        int start=0;
        int maxLen=1;
        for(int i=0;i<n;i++){
            int len1=palindrome(s,i,i);
            int len2=palindrome(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len > maxLen){
                maxLen=len;
                start=i-(len-1)/2;
            }

        }
        return s.substring(start,start+maxLen);
    }
    public int palindrome(String s,int l,int r){
        while((l>=0 && r<s.length()) && (s.charAt(l)==s.charAt(r)) ){
            l--;
            r++;
        }
        return r-l-1;
    }
}