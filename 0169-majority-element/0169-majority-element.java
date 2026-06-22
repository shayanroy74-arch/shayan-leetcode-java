class Solution {
    public int majorityElement(int[] nums) {
        int can=nums[0];
        int ctr=1;

        for(int i=1;i<nums.length;i++){
            if(ctr!=0){
                if(can == nums[i]){
                ctr++;
            }
            else{
                ctr --;
            }
            }
            else{
                can = nums[i];
                ctr=1;
            }
            

            
        }
        return can;
    }
}