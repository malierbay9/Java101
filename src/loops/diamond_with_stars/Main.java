package loops.diamond_with_stars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Basamak Sayisini Giriniz : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

        for (int y = n - 1; y >= 1; y--) {
            for (int k = n; k > y; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * y - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
