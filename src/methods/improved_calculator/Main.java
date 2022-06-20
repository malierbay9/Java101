package methods.improved_calculator;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int select;
    String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme İşlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Mod Alma\n"
            + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";

    System.out.println(menu);
    while (true) {

        System.out.print("Bir işlem seçiniz : ");
        select = scan.nextInt();
        if (select == 0) {
            System.out.println("Çıkış yapıldı.");
            break;
        }

        System.out.print("İlk sayiyi giriniz : ");
        double a = scan.nextDouble();
        System.out.print("İkinci sayiyi giriniz : ");
        double b = scan.nextDouble();

        switch (select) {
            case 1:
                toplama(a, b);
                break;
            case 2:
                cıkarma(a, b);
                break;
            case 3:
                çarpma(a, b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Bölen sayi 0 olamaz.");
                } else {
                    bölme(a, b);
                }
                break;
            case 5:
                üs(a, b);
                break;
            case 6:
                modAlma(a,b);
                break;
            case 7:
                rectangle(a,b);
                break;

            default:
                System.out.println("Gecersiz bir işlem girdiniz.");
        }
    }
}

    static double toplama(double a, double b) {
        double result = a + b;
        System.out.println("Toplam :" + result);
        return result;

    }

    static double cıkarma(double a, double b) {
        double result = a - b;
        System.out.println("Fark :" + result);
        return result;

    }

    static double çarpma(double a, double b) {
        double result = a * b;
        System.out.println(a + " kere " + b + " eşittir :" + result);
        return result;
    }

    static double bölme(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println(a + " bölü " + b + " eşittir : " + result);
            return result;
        } else {

            return 0.0;
        }
    }

    static double üs(double a, double b) {
        double result = 1;
        for (int i = 1; i < b; i++) {
            result *= a;

        }
        System.out.println(a + "üssü" + b + "eşittir : " + result);
        return result;

    }
    static double modAlma(double a,double b){
        double result=a%b;
        System.out.println(a+"mod"+b+"eşittir : "+result);
        return result;

    }
    static void rectangle(double a,double b){
        double çevre=2*(a+b);
        double alan=a*b;
        System.out.println("Dikdörtgenin çevresi : "+çevre);
        System.out.println("Dikdörtgenin alanı : "+alan);
    }
}
