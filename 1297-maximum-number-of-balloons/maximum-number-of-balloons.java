class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> res=new HashMap<>();
        for(char ch : text.toCharArray()){
            res.put(ch,res.getOrDefault(ch,0)+1);
        }
        int c=Integer.MAX_VALUE;
        String s="balon";
        for(int i=0;i<s.length();i++){
            int a = res.getOrDefault(s.charAt(i), 0);
            if(s.charAt(i)=='l' || s.charAt(i)=='o') c=Math.min(a/2,c);
            else c=Math.min(a,c);
        }
        return c;
    }
}