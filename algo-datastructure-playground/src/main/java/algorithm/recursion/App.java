package algorithm.recursion;

public class App {

    public static void main(String[] args) {
        //reduceByOne(4);

        //System.out.println(recursiveLinearSearch(4, new int[]{1,2,3,4,5}, 0));

        System.out.println(recursiveBinarySearch(0, 7, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 7));
    }

    public static void reduceByOne(int n) {
        System.out.println(n);
        if (n <= 0)
            System.out.println("end");
        else
            reduceByOne(n - 1);
    }

    public static int recursiveLinearSearch(int x, int a[], int i) {
        if (i > a.length - 1) return -1;
        else if (a[i] == x) return i;
        else return recursiveLinearSearch(x, a, i + 1);

    }

    public static int recursiveBinarySearch(int start, int end, int[] arr, int x) {
        if (start > end) {
            return -1;
        } else {
            int q = (start + end) / 2;
            if (arr[q] == x) return q; // returns index
            else if (x < arr[q]) {
                return recursiveBinarySearch(start, q - 1, arr, x);
            } else // if (x > arr[q]) {
                return recursiveBinarySearch(q + 1, end, arr, x);
        }
    }
}
