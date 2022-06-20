package basics_and_variables.grade_average;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notun: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notun: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notun: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notun: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notun: ");
        muzik = inp.nextInt();

        double sonucum = (mat + fizik + turkce + tarih + muzik) / 5;
        System.out.println("Not ortalaman: "+sonucum);
        String sonuc = 60 < sonucum ? "Geçtin:) " : "Kaldın:( ";

        System.out.println(sonuc);
    }
}
