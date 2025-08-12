class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
         char[] one = new char[256];
         char[] two = new char[256];

        for(int i=0; i< s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(one[c1] != c2) {one[c1] = c2; }
            if(two[c2] != c1) {two[c2] = c1; }
        }

        for(int i=0; i< s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(c1 != two[c2]) return false;
            if(c2 != one[c1]) return false;
        }

        return true;
    }
}