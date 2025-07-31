class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    int count = 0;
        while(m>=1 && n>=1){
            
        if(nums1[m-1]<= nums2[n-1]){
                nums1[nums1.length-1-count] = nums2[n-1];
                n--;
                
        } else{
            nums1[nums1.length-1-count] = nums1[m-1];
            m--;
        }
        count++;
        }
        
        if(n>0){
            for(int i=0; i<n;i++){
                nums1[i]= nums2[i];
            }
        }
        
    }
}