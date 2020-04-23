package patterns.slidingwindow;

public class AverageOfSubArrays {

    public static void main(String[] args) {
        System.out.println(findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }));
    }

    // For given array 'arr' find average (sum of all/k) subarrays of size 'k'
    // Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
    // Output: [2.2, 2.8, 2.4, 3.6, 2.8]
    public static double[] findAverages(int k, int[] arr) {

        double[] result = new double[arr.length - k +1 ];
        double sum = 0;
        int windowStart = 0;

        for (int i=0; i < arr.length; i++) { // O(n)

            sum += arr[i];
            if (i >= k-1) { // time to slide window
                result[windowStart] = sum/k;
                sum -= arr[windowStart];
                windowStart++;
            }
        }

        return result;
    }

}
