public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int minSoFar = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap maxSoFar and minSoFar when multiplied by a negative number
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);
            maxProd = Math.max(maxProd, maxSoFar);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum product subarray is: " + maxProduct(arr));
    }
}
