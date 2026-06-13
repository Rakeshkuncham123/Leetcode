class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        //char alpha[]={,'k','j','i','h','g','f','e','d','c','b','a'};
        for(String s : words){
             int res=0;
             for(char ch : s.toCharArray()){
                res+=weights[ch-'a'];
             }
             int m=25-res%26;
             //int x=26-(m+1);
             //System.out.println(m+" "+x);
            ans.append((char)('a'+m));
        }
        return ans.toString();
    }
}