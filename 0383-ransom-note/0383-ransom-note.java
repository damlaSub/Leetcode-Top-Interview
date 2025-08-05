class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapRan = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            mapRan.put(ransomNote.charAt(i), mapRan.getOrDefault(ransomNote.charAt(i), 0)+1);    
        }
        HashMap<Character, Integer> mapMag = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            mapMag.put(magazine.charAt(i), mapMag.getOrDefault(magazine.charAt(i), 0)+1);    
        }
        for(Character c: mapRan.keySet()){
            if(!mapMag.containsKey(c)) return false;
            else if (mapMag.containsKey(c) && mapMag.get(c) < mapRan.get(c)) return false;
        }
        return true;
    }
}