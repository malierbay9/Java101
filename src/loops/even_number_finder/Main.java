package loops.even_number_finder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,i,s=-1;
        double ort,sum=0;

        System.out.print("Sayı Girin : ");
        k = input.nextInt();

        for(i=0;i<=k;i++){
            if(i % 3 == 0 || i % 4 ==0){
                sum+=i;
                s++;
            }
        }
        ort = sum/s;
        System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması : " + ort);
    }
}
