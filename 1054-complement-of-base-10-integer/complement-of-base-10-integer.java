class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String bit="";
        while(n>0){
            int rem=n%2;
            bit=Integer.toString(rem)+bit;
            n=n/2;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<bit.length();i++){
            if(bit.charAt(i)=='1') res.append('0');
            else res.append('1');
        }
        int m=Integer.parseInt(res.toString(),2);
        return m;
    }
}