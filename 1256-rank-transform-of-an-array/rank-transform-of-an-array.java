class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        Arrays.sort(res);
        Map<Integer,Integer> m=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++){
           if(!m.containsKey(res[i])){
            m.put(res[i],rank);
            rank++;
           }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=m.get(arr[i]);
        }

        return arr;
    }
}