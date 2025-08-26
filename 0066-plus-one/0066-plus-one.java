class Solution {
    
    public int[] plusOne(int[] digits) {
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i= digits.length-1; i>=0; i--){
           if(digits[i]+ count <=9){
            list.add(count + digits[i]);
            count = 0; 

           } else {
                list.add(0);
           }
        }
        if(count > 0){ list.add(count);}


        int[] result = new int[list.size()];

        for(int j = 0; j < list.size() ; j++){
            int act = list.get(j);
            result[j] = list.get(list.size() -1 -j);
            result[list.size() -1 -j] = act;
        }

        return result;
        
    }
}