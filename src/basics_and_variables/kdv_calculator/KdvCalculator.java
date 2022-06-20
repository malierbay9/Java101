package basics_and_variables.kdv_calculator;

import java.util.Scanner;

public class KdvCalculator {

    public static void main(String[] args) {

        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutari giriniz: ");
        tutar = input.nextDouble();

        if (tutar < 1000 && tutar >0) {
            double kdvOran = 0.18;
            double kdvtutari = tutar * kdvOran;
            double kdvliTutar = tutar + kdvtutari;
            System.out.println(kdvliTutar);
        } else if (tutar > 1000) {
            double kdvOran = 0.08;
            double kdvtutari = tutar * kdvOran;
            double kdvliTutar = tutar + kdvtutari;
            System.out.println(kdvliTutar);
        } else {
            System.out.println("İslemleri kontrol edin..");
        }

    }

}
