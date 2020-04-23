package algorithm.linearsearch;

public class App {

    public static void main(String[] args) {
        int find39 = linearSearch(new int[]{1, 3, 59, 20, 39, 10}, 39);
        int find88 = linearSearch(new int[]{1, 3, 59, 20, 39, 10}, 88);

        System.out.println(find39);
        System.out.println(find88);
    }

    public static int linearSearch(int[] list, int toFind) {
        for (int i = 1; i <= list.length-1; i++) {
            if (list[i]==toFind)
                return i;
        }

        return -1;
    }

}
