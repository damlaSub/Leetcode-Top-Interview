class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if(haystack.contains(needle)){

            for(int i =0; i<=haystack.length()-needle.length();i++){
                if(haystack.substring(i, needle.length()+i).equals(needle)) {
                    result = i;
                    return result;
                }
            }

        } 
        return result;
    }
}