package patterns.slidingwindow;

public class MaxSumOfSubArrays {

    public static void main(String[] args) {
        // Input: [2, 1, 5, 1, 3, 2], k=3
        // Output: 9
        // Explanation: Subarray with maximum sum is [5, 1, 3].
        System.out.println(findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));

        // Input: [2, 3, 4, 1, 5], k=2
        // Output: 7
        // Explanation: Subarray with maximum sum is [3, 4].
        System.out.println(findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }

    // Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any consecutive subarray of size ‘k’.
    public static int findMaxSumSubArray(int k, int[] arr) {

        int max = -1;
        int sum = 0;
        int windowStart = 0;

        for (int i=0; i < arr.length;i++) {

            if (i >= k) {
                if (sum > max) max = sum;
                sum -= arr[windowStart];
                sum += arr[i];
                windowStart++;
            } else {
                sum += arr[i];
            }
        }
        return max;
    }

}
