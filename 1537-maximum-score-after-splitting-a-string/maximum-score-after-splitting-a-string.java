class Solution {
    public int maxScore(String s) {
        int n=s.length()-1;
       int left[]=new int[n];
       int right[]=new int[n];
       int z=0;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='0') z++;
        left[i]=z;
       }
       //System.out.println(Arrays.toString(left));
       int o=0;

       for(int i=n-1;i>=0;i--){
        if(s.charAt(i+1)=='1') o++;
        right[i]=o;
       }
       //System.out.println(Arrays.toString(right));
       int res=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        int c=left[i]+right[i];
        res=Math.max(res,c);
       }
       return res; 
    }
}