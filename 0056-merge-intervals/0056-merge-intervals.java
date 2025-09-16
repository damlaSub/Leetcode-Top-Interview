class Solution {
    public int[][] merge(int[][] intervals) {
    if (intervals.length == 1) return new int[][] { intervals[0] };
    List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] myInter = new int[]{intervals[0][0], intervals[0][1]};

        
        for(int i =1; i< intervals.length; i++){
            int tempMiddle = intervals[i][0];
            int tempEnd = intervals[i][1];
            
            if(tempMiddle >= myInter[0] && tempMiddle <= myInter[1]) {
                myInter[1] = Math.max(tempEnd, myInter[1]) ;
                
            } else {
                list.add(new int[]{myInter[0], myInter[1]});
                
                myInter[0] = intervals[i][0];
                myInter[1] = intervals[i][1];

            }
           
           

            

        }
        list.add(new int[]{myInter[0], myInter[1]});

        int result[][] = new int[list.size()][2];
        for(int j=0; j< list.size(); j++){
            result[j] = list.get(j);
        }
        return result;
        
    }
}