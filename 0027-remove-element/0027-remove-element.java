class Solution {
    public int removeElement(int[] nums, int val) {
        int occurences= 0;
        int lastIndex = nums.length -1;

        for(int i = 0; i< lastIndex+1; i++){
           if(nums[i] == val){
            if(i == lastIndex) {
                occurences++;
                return nums.length - occurences;
            }
            while(lastIndex> i && nums[lastIndex] == val){
                    occurences++;
                    lastIndex--;
                 
            }
            nums[i] = nums[lastIndex];
            nums[lastIndex] = val;
            occurences++;
            if(lastIndex>i){
                lastIndex--;
            }
           }
            
        }
        return nums.length - occurences;
    }
}