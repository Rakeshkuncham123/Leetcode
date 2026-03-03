class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0");
        for(int i=2;i<=n;i++){
            StringBuilder in=new StringBuilder();
            for(int j=0;j<s.length();j++){
                in.append(s.charAt(j)=='0'?'1':'0');
            }
            in.reverse();
            s.append('1').append(in);
        }
        return s.charAt(k-1);
    }
}