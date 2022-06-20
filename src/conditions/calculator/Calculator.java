package conditions.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n , m , h;
        Scanner input= new Scanner(System.in);
        System.out.println( "ilk sayinizi giriniz");
        n= input.nextInt();
        Scanner input1= new Scanner(System.in);
        System.out.println( "ikinci sayinizi giriniz");
        m= input.nextInt();
        Scanner input2= new Scanner(System.in);
        System.out.println( "toplam 1\n cikarma 2\n carpma 3\n bolme 4 sekilde  seciniz");
        System.out.println( "seciminiz : ");
        h= input.nextInt();

        switch (h) {
            case 1 :
                System.out.println( "Toplam : " + (n + m));
                break;
            case 2 :
                System.out.println( "Toplam : " + (n - m));
                break;
            case 3 :
                System.out.println( "Toplam : " + (n * m));
                break;
            case 4 :
                if (m != 0){
                    System.out.println(n / m);
                }
                else {
                    System.out.println("0 bulunmez");
                }
                break;
            default :

                System.out.println("Yanlis Secim Sectiniz");


        }
    }
}
