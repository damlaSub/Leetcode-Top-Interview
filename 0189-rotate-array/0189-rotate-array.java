class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; //in case: k > nums.lenght 
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
        
    }
    static void reverseArray(int[] numbers, int firstIndex, int lastIndex){
        while(firstIndex < lastIndex){
            int temp = numbers[firstIndex];
            numbers[firstIndex] = numbers[lastIndex];
            numbers[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
            
        }
}