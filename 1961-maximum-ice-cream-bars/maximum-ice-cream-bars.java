class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        long res=0;
        int c=0;
        for(int i=0;i<costs.length;i++){
            res+=costs[i];
            if(res<=coins) {
                //res+=costs[i];
                c++;
            }    
        }
        return c;
    }
}