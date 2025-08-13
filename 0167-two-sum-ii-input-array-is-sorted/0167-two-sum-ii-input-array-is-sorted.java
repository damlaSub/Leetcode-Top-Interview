class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i=0;
        int y = numbers.length-1;
        while( i< y){
            int sum = numbers[i]+numbers[y];
             if(sum == target){
                res[0] = i+1;
                res[1] = y+1;
                break;
            }  
            while(sum<target){
                i++;
                sum = numbers[i]+numbers[y];
            }
            while(sum>target){
                y--;
                sum = numbers[i]+numbers[y];
            }
           
        }
        return res;
    }
}