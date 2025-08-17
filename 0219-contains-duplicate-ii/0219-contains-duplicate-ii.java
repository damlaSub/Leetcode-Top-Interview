class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i< nums.length-1; i++){
            int j =i+1;
            while(j<= i+k && j<nums.length ){
                if(nums[i] != nums[j]){
                    j++;
                } else {
                    break;
                }
                
            }
            if(j<nums.length && j<= i+k && nums[i] == nums[j]){
                    return true;
                }
        }
        return false;
    }
}