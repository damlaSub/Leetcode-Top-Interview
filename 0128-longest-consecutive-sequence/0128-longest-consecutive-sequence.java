class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        int max=0;
        int temp=0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                temp++;
            } else if(nums[i+1] == nums[i]){
                temp = temp;
            } else {
                temp = 0;
            }
            max = Math.max(temp, max);
        }
        return max+1;
    }
}