class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i =0; i< nums.length-1; i++){
            if(i> maxIndex) return false;
            if(i+nums[i]>= nums.length-1) return true;
            else{
                maxIndex = Math.max(maxIndex, i+nums[i]);
            }
            
              
           
        }

        return maxIndex >= nums.length-1;
    }

}