class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            String sorted = strSort(s);
            if(map.get(sorted) == null){
                List<String> inner = new ArrayList<>();
                inner.add(s);
                map.put(sorted, inner);
            } else {
                List<String> inner = map.get(sorted);
                inner.add(s);
                map.replace(sorted, inner);
            }   

        }

        for(List innerList: map.values()){
            res.add(innerList);
        }

        return res;
    
    }

    String strSort(String s){

    char[] chars = s.toCharArray(); 
    Arrays.sort(chars);           
    return new String(chars);
                        
    }

}