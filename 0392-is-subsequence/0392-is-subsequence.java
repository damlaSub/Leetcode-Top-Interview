class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i=0; i< s.length(); i++){
            int actual = s.charAt(i);
            boolean found = false;
            while(j < t.length()){
                if(actual == t.charAt(j)){
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if(!found) return false;
        }
        return true;
    }
}