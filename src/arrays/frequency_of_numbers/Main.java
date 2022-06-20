package arrays.frequency_of_numbers;

import java.util.Arrays;

public class Main {
    public static void frequency(int[] arr){

        for(int i = 0;i< arr.length;i++){
            Arrays.sort(arr);
            int ct=0;

            for (int j = 0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    ct++;
                }
            }
            if(i==0){
                System.out.println(arr[i] + " Sayısı " + ct + " kere tekrar edildi.");
            }
            if((i>0)&&(arr[i]!=arr[i-1])) {
                System.out.println(arr[i] + " Sayısı " + ct + " kere tekrar edildi.");
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3,1,2,2,4,5,7,4};
        frequency(test);
    }
}
