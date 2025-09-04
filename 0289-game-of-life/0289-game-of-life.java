class Solution {
    public void gameOfLife(int[][] board) {
       
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, ArrayList<Integer>> neighMap = new HashMap<>();

    for (int y = 0; y < board.length; y++) {
    for (int x = 0; x < board[y].length; x++) {
        int actual = board[y][x];
        String actualMN = "m" + y + "n" + x;
        ArrayList<Integer> inner = new ArrayList<>();

        // left-top
        if (y > 0 && x > 0) {
            int leftTopVal = board[y - 1][x - 1];
            String leftTopKey = "m" + (y - 1) + "n" + (x - 1);
            if (!map.containsKey(leftTopKey)) {
                map.put(leftTopKey, leftTopVal);
            }
            inner.add(leftTopVal);
        }

        // left
        if (x > 0) {
            int leftVal = board[y][x - 1];
            String leftKey = "m" + y + "n" + (x - 1);
            if (!map.containsKey(leftKey)) {
                map.put(leftKey, leftVal);
            }
            inner.add(leftVal);
        }

        // left-bottom
        if (y < board.length - 1 && x > 0) {
            int leftBottomVal = board[y + 1][x - 1];
            String leftBottomKey = "m" + (y + 1) + "n" + (x - 1);
            if (!map.containsKey(leftBottomKey)) {
                map.put(leftBottomKey, leftBottomVal);
            }
            inner.add(leftBottomVal);
        }

        // middle-top
        if (y > 0) {
            int middleTopVal = board[y - 1][x];
            String middleTopKey = "m" + (y - 1) + "n" + x;
            if (!map.containsKey(middleTopKey)) {
                map.put(middleTopKey, middleTopVal);
            }
            inner.add(middleTopVal);
        }

        // right-top
        if (y > 0 && x < board[y].length - 1) {
            int rightTopVal = board[y - 1][x + 1];
            String rightTopKey = "m" + (y - 1) + "n" + (x + 1);
            if (!map.containsKey(rightTopKey)) {
                map.put(rightTopKey, rightTopVal);
            }
            inner.add(rightTopVal);
        }

        // right
        if (x < board[y].length - 1) {
            int rightVal = board[y][x + 1];
            String rightKey = "m" + y + "n" + (x + 1);
            if (!map.containsKey(rightKey)) {
                map.put(rightKey, rightVal);
            }
            inner.add(rightVal);
        }

        // middle-bottom
        if (y < board.length - 1) {
            int middleBottomVal = board[y + 1][x];
            String middleBottomKey = "m" + (y + 1) + "n" + x;
            if (!map.containsKey(middleBottomKey)) {
                map.put(middleBottomKey, middleBottomVal);
            }
            inner.add(middleBottomVal);
        }

        // right-bottom
        if (y < board.length - 1 && x < board[y].length - 1) {
            int rightBottomVal = board[y + 1][x + 1];
            String rightBottomKey = "m" + (y + 1) + "n" + (x + 1);
            if (!map.containsKey(rightBottomKey)) {
                map.put(rightBottomKey, rightBottomVal);
            }
            inner.add(rightBottomVal);
        }
        // store neigh.
        neighMap.put(actualMN, inner);
    }
}


    for (int y = 0; y < board.length; y++) {
        for(int x = 0; x < board[y].length; x++){
            
            int actual = board[y][x];
            String actualMN = "m"+y+"n"+x;
            int dead = 0;
            int live = 0;
            for (int n : neighMap.get(actualMN)){
                if(n == 0) dead++;
                else {
                    live++;
                }
            }
            if(actual == 0 ){
                if(live == 3){
                    board[y][x] = 1;
                }
                
            } else if(live <2 || live >3) {
               board[y][x] = 0;
            } else {
                board[y][x] = actual;
            }
        }
    }

    }
}