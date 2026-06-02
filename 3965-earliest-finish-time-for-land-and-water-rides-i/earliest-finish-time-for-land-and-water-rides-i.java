class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int res=Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int s=landStartTime[i];
                int f=s+landDuration[i];
                if(f>waterStartTime[j]){
                    total=f+waterDuration[j];
                }else{
                    total=waterStartTime[j]+waterDuration[j];
                }
                res=Math.min(total,res);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int s=waterStartTime[i];
                int f=s+waterDuration[i];
                if(f>landStartTime[j]){
                    total=f+landDuration[j];
                }else{
                    total=landStartTime[j]+landDuration[j];
                }
                res=Math.min(total,res);
            }
        }
        return res;
    }
}