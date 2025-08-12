class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
           if(map.get(c1) == null){
                if(!map.containsValue(c2)){
                    map.put(c1, c2);
                } else {
                    return false;
                }
            } else {
                if(map.get(c1) != c2) return false;
           }

        }
        return true;
    }
}