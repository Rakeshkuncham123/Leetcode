class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='*'){
                if(res.length()>0)  res.deleteCharAt(res.length()-1);
            }
            else if(ch=='#') res.append(res);
            else if(ch=='%'){
                int l=0;
                int r=res.length()-1;
                while(l<r){
                    char temp=res.charAt(l);
                    res.setCharAt(l,res.charAt(r));
                    res.setCharAt(r,temp);
                    l++;
                    r--;
                }
            }
            else{
                res.append((char)ch);
            }
        }
        return res.toString();
    }
}