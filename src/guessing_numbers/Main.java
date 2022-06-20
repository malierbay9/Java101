package guessing_numbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] mistakes = new int[5];
        boolean isWin = false;
        boolean isFailed = false;

        while (right < 5) {

            System.out.println("Lütfen tahmininizi giriniz :");
            selected = input.nextInt();

            if (selected > 99 || selected < 0) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz !");
                if (isFailed) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - right));
                } else {
                    System.out.println("Bir daha ki hatalı tahmininizde canınız azalcaktır ! ");
                    isFailed = true;

                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, tahmininiz doğru ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;

            } else{

                mistakes[right++] = selected;

                System.out.println("Hatalı bir sayi girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " Sayısı , gizli sayıdan büyüktür.");
                }
                if (selected < number) {
                    System.out.println(selected + " Sayısı , gizli sayıdan küçüktür.");
                }

                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }
            if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Doğru sayi " + number + " olacaktı.");
            if (!isFailed) {
                System.out.println("Tahminleriniz : " + Arrays.toString(mistakes));
            }
        }
    }
}
