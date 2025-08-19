class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
       int result = n;  
        while(result != 1 && !set.contains(result)){
            set.add(result);
            result = getSquare(String.valueOf(result));
            
       }
        return result ==1;
    }
    

       int getSquare(String str){
        int sum = 0;
            for(int i=0; i< str.length(); i++){
                int num = Character.getNumericValue(str.charAt(i));
            sum += (num * num);
            }
            return sum;

        } 

        
}
