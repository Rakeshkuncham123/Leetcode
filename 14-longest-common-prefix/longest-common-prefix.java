class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String st=strs[0];
        for(String s : strs){
            if(s.length()<st.length()){
                st=s;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            for(String s : strs){
                if(s.charAt(i)!=ch) return res.toString();
            }
            res.append(ch);
        }
        return res.toString();
    }
}