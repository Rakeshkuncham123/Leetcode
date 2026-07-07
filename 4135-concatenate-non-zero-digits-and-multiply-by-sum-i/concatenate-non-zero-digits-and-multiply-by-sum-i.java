class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            long a=s.charAt(i)-'0';
            if(a>0) x=x*10+a;
            //System.out.println(x);

        }
        long res=x;
        long sum=0;
        while(x>0){
            long rem=x%10;
            sum+=rem;
            x=x/10;
            //System.out.println(sum);
        }
        return res*sum;
    }
}