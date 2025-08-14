class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
         StringBuilder bld = new StringBuilder();


        for(int i=0; i< s.length(); i++){
        
           char c = s.charAt(i);
           int index = bld.indexOf(String.valueOf(c));
           
            if(index < 0 ){
                bld.append(c);
                
            } else {
                 
                    bld.delete(0, index+1);
                    bld.append(c); 
            }

            longest = Math.max(longest, bld.length());
        }
        return longest;
    }
}