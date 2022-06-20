package basics_and_variables.taximeter;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double km , perkm = 2.20 , toplam = 10 ;

        System.out.print("Mesafe Km cinsinden gir : ");

        km =input.nextInt();
        toplam= toplam + (km * perkm) ;
        // variable = (condition) ? expressionTrue :  expressionFalse

        toplam = (toplam>20) ? toplam : 20;

        System.out.print("Ödemeniz Gereken Ücret : " + toplam  );
    }
}
