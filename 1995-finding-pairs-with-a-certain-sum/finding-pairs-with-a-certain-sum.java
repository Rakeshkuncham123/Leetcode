class FindSumPairs {
    int arr1[];
    int arr2[];
    HashMap<Integer,Integer> hs;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.arr1=nums1;
        this.arr2=nums2;
        this.hs=new HashMap<>();
        for(int num : nums2){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int old=arr2[index];
        hs.put(old,hs.getOrDefault(old,0)-1);
        arr2[index]+=val;
        int newv=arr2[index];
        hs.put(newv,hs.getOrDefault(newv,0)+1);
    }
    
    public int count(int tot) {
        int res=0;
        for(int ele : arr1){
            int target=tot-ele;
            res+=hs.getOrDefault(target,0);
        }
        return res;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */