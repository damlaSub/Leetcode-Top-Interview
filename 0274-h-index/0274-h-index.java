class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int articalNumber = citations.length;
        int minCitation = citations[0];
         

        for(int i=0; i< articalNumber; i++){
            int n = articalNumber-i;
            
               int temp = Math.min(n, citations[i]);
               minCitation = Math.max(temp, minCitation);
            

            
            
        }
        return Math.min(minCitation, articalNumber);

    }
}
