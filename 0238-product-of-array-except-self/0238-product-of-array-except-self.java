class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = 1;
        for(int i=1; i< len; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[len-1] = 1;
        for(int j=len-2; j>=0; j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }
        
        for(int i = 0; i< len; i++){
            answer[i] = suffix[i] * prefix[i];
            
        }
        
        
        return answer;
    }
}

//prefix[1,1,2,6]
//suffix[24,12,4,1]