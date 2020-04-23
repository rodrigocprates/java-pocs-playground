package algorithm.binarysearch;

public class App {

    public static void main(String[] args) {
        System.out.println(binarySearch(12, new int[]{1,2,3,4,7,9,12,18}));
    }

    public static int binarySearch(int x, int[] a) {
        int start = 0;
        int end = a.length-1;

        while(start <= end) {
            int c = (start+end)/2; // get into the middle
            if (a[c]==x) return c;
            else if (x < a[c]) end = c-1;
            else if (x > a[c]) start = c+1;
        }

        return -1;
    }

}
