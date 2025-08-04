class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        String str = s.trim();
        for(int i = str.length()-1; i>=0; i--){
        
            if(Character.isLetterOrDigit(str.charAt(i))) {
                result++;
            } else{
                return result;
            }
    
        }
        return result;
    }
}