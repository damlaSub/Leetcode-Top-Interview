class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int i = 0;

        while (i < nums.length - 1) {
            int farthest = 0;
            int bestIndex = i;

            int end = i + nums[i];
            if (end >= nums.length - 1) {
                jumps++;
                break; 
            }

            for (int j = i + 1; j <= end; j++) {
                if (j + nums[j] > farthest) {
                    farthest = j + nums[j];
                    bestIndex = j;
                }
            }

            i = bestIndex; 
            jumps++;
        }

        return jumps;
    }
}
