class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]= new int[nums.length];
        prefix[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int ctr=0;
        for(int i=0;i<prefix.length;i++){
            int start = i;
            for(int j=i;j<prefix.length;j++){
                int end = j;
                             
                if(start!= 0){
                    if(prefix[end]-prefix[start-1]==k){
                        ctr++;
                    }
                }
                else if(start==0){
                    if(prefix[end]==k){
                        ctr++;
                    }
                }
            }
        }
        return ctr;
    }
}