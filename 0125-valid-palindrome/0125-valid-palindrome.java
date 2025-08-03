class Solution {
    public boolean isPalindrome(String s) {
        int k =  s.length() -1;
        int i = 0;
        while(i< k){
            while(i< k && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(k>i && !Character.isLetterOrDigit(s.charAt(k))){
                k--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(k))) return false;

            i++;
            k--;
        }

        return true;
    }
}