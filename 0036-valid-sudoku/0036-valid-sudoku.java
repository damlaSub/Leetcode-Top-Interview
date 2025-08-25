class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Integer> leftToRight = new HashMap<>();
        HashMap<Integer, Integer> topToBottom = new HashMap<>();
        HashMap<Integer, Integer> subBox = new HashMap<>();

         HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seen.add(c + " in row " + i) ||
                        !seen.add(c + " in col " + j) ||
                        !seen.add(c + " in box " + (i / 3) + "-" + (j / 3))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}