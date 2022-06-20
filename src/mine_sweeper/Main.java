package mine_sweeper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Oyun Alanının Boyutlarını Seçiniz !");
        System.out.println("Satır sayısı giriniz : ");
        int row = input.nextInt();
        System.out.println("Sütun Sayısı Giriniz : ");
        int col = input.nextInt();

        MineSweeper ms = new MineSweeper(row, col);

        ms.run();
    }
}
