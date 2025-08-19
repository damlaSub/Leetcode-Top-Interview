class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
        for(int i=0 ; i < nums.length; i++){
            int y = i+1;
            int second  = target - nums[i];
           while(y< nums.length){
            if(second == nums[y]){
                res[0] = i;
                res[1] = y;
                return res;
            }
            y++;
           }
        }
        return res;
    }
}