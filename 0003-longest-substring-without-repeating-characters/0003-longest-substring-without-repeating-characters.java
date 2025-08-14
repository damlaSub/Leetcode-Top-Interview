class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
         StringBuilder bld = new StringBuilder();
         HashMap<Character, Integer> map = new HashMap<>();


        for(int i=0; i< s.length(); i++){
           
            char c = s.charAt(i);

            if(!map.containsKey(c)){
                map.put(c, i);
                bld.append(c);
                longest = Math.max(longest, bld.length());
            } else {
                 
                    bld.delete(0, bld.indexOf(String.valueOf(c))+1);
                    bld.append(c);
                    map.replace(c, i);
                    longest = Math.max(longest, bld.length());
            }

            
        }
        return longest;
    }
}