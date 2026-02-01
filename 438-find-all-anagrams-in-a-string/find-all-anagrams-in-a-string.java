class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(s.length()<p.length()) return res;

        int[] pc=new int[26];
        int[] sc=new int[26];

        for(int i=0;i<p.length();i++){
            pc[p.charAt(i)-'a']++;
            sc[s.charAt(i)-'a']++;
        }

        int ws=p.length();

        for(int i=ws;i<s.length();i++){
            if(Arrays.equals(pc,sc)) res .add(i-ws);
            sc[s.charAt(i-ws)-'a']--;
            sc[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pc,sc)) res .add(s.length()-ws);
        return res;
    }
}