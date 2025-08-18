class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int articalNumber = citations.length;
        int maxH = 0;
         

        for(int i=0; i< articalNumber; i++){
            int n = articalNumber-i;
            
               int temp = Math.min(n, citations[i]);
               maxH = Math.max(temp, maxH);
            

            
            
        }
        return maxH;

    }
}
