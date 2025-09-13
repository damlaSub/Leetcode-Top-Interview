class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> result = new ArrayList<>();
    if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

    while(top<= bottom && left <= right){
        //  left to right 
        for(int i = left; i<=right;i++){
            result.add(matrix[top][i]);
        }
        top++;

        //top to bottom
        if(top<=bottom){
            for(int j = top; j<=bottom; j++){
            result.add(matrix[j][right]);
        }
        right--;
        }
        
        //right to left 
        if(left<=right && top <= bottom){
            for(int k = right; k >= left; k--){
            result.add(matrix[bottom][k]);
        }
        bottom--;
        }
        
        //bottom to top
        if(bottom>=top && left<=right){
            for(int x = bottom; x>=top; x--){
            result.add(matrix[x][left]);
        }
        left++;
        }
        


    }
    return result;
        
    }
}