import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        
        for (int i = 0; i < arr.length; i++) {
            int bits = Integer.bitCount(arr[i]);
            arr[i] = (bits << 14) | arr[i];
        }

        
        Arrays.sort(arr);

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] & ((1 << 14) - 1);
        }

        return arr;
    }
}