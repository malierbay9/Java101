package arrays.max_min_in_array;

public class Main {
    public static void maxmin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int temp : arr) {
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }

        }
        System.out.println("Max. Değer : " + max);
        System.out.println("Min. Değer : " + min);
    }

    public static void main(String[] args) {
        int[] arr = {32,21,3,11,9,0,47,8};
        maxmin(arr);
    }


}
