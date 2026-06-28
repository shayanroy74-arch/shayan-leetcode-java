class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefix =  new HashMap<>();
        int sum=0;
        int ctr=0;
       
        prefix.put(0,1);
        for(int i=0;i<nums.length;i++){
           sum = sum+nums[i];
           if(prefix.containsKey(sum-k)){
                ctr = ctr + prefix.get(sum-k);
           }

           if(prefix.containsKey(sum)){
                int x = prefix.get(sum);
                x=x+1;
                prefix.put(sum,x);
           }
           else{
                prefix.put(sum,1);
           }
        }
        
        
        return ctr;
    }
}