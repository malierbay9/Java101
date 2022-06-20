package arrays.repeating_numbers;

public class Main {

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void repeatingNumbers(int[] arr) {
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int i : duplicate) {
            if(i!=0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 7, 8, 9};

        repeatingNumbers(arr);

    }

}
