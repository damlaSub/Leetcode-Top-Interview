class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        
        HashMap<String, Character> map1 = new HashMap<>();
        HashMap<Character, String> map2 = new HashMap<>();

        for(int i=0; i< pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = arr[i];
            if(map2.get(c) == null && map1.get(w) == null ){
                map2.put(c, w);
                map1.put(w, c);
            } else if(map2.get(c)!=null && !map2.get(c).equals(w)){
                    return false;
            } else  if(map1.get(w) != null && !map1.get(w).equals(c)){
                return false;
               
            }
               
        }
        return true;
    }
}