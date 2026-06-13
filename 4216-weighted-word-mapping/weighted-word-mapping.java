class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        char alpha[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(String s : words){
             int res=0;
             for(char ch : s.toCharArray()){
                res+=weights[ch-'a'];
             }
             int m=res%26;
             //int x=26-(m+1);
             //System.out.println(m+" "+x);
            ans+=alpha[26-(m+1)];
        }
        return ans;
    }
}