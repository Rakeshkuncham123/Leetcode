class Solution {
    public int[] shortestToChar(String s, char c) {
        int res[]=new int[s.length()];
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) ls.add(i);
        }
        for(int i=0;i<res.length;i++){

            res[i]=Integer.MAX_VALUE;
            for(int num : ls){
                if(num==i){
                    res[i]=0;
                    break;
                }
                res[i]=Math.min(res[i],Math.abs(i-num));
            }
        }
        return res;
    }
}