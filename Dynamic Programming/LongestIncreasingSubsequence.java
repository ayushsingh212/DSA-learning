public class LongestIncreasingSubsequence {

    // Function to find length of LIS using DP (O(n^2))
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 1;

        // Initialize dp array, each element is at least length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Compute LIS length ending at each index i
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of Longest Increasing Subsequence: " + lengthOfLIS(nums));
    }
}
