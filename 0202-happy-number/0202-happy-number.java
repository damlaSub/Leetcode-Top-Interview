class Solution {
    public boolean isHappy(int n) {
       String s = String.valueOf(n);  
       HashSet<Integer> set = new HashSet<>();

       int result = getSquare(s);  
       if(result == 1){
        return true;
       } else {
            while(result != 1){
        result = getSquare(String.valueOf(result));
        if(result == 1) return true;
        else if(set.contains(result)) return false;  
        else {set.add(result);}
       }
       }
    
       
      
       

        return false;
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
