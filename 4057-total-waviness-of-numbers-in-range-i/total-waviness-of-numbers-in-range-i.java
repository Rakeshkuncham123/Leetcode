class Solution {
    public int totalWaviness(int num1, int num2) {
        int waves=0;
        for(int i=num1; i<=num2;i++){
            if(i>100){
                int temp=i;
                int c=0;
                while(temp>0){
                    c++;
                    temp/=10;
                }
                int digits[]=new int[c];
                temp=i;
                for(int j=c-1;j>=0;j--){
                    digits[j]=temp%10;
                    temp/=10;
                }
                for(int k=1;k<c-1;k++){
                    if(digits[k]>digits[k-1] && digits[k]>digits[k+1]) waves++;
                    else if(digits[k]<digits[k-1] && digits[k]<digits[k+1]) waves++;
                }
            }
        }
        return waves;
    }
}