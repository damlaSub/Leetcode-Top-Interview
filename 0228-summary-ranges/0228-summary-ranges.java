class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();       
        for(int i = 0; i < nums.length; i++){

            int left = nums[i];

            int j = i;

            int right = nums[j];

            while(j+1 < nums.length){
                    if(right +1 == nums[j+1]){
                        right = nums[j+1];
                    j++;
                    } else {
                       
                    break;
                    } 
                        
            }
            
        if(left == nums[j]){
            result.add(String.valueOf(left));
        } else {
            result.add(left + "->" + right);
        }
            i=j;
           
        }
       

        return result;

    }
} 
