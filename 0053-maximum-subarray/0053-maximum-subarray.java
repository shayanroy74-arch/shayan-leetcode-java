class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms = Integer.MIN_VALUE;
        int ctr = 0;
       
       for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ctr++;
            }
            
       }

       if(ctr == nums.length){
            for(int i=0;i<nums.length;i++){
                if(ms<nums[i]){
                    ms= nums[i];
                }
            }
       }
       else{
            for(int i=0;i<nums.length;i++){
            
                cs=cs+nums[i];
                if(cs<0){
                    cs=0;
                }
                ms= Math.max(ms,cs);
            }
       }
        
        
            return ms;
        }
        

        
    }
