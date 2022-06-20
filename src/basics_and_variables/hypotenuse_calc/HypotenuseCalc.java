package basics_and_variables.hypotenuse_calc;

import java.util.Scanner;

public class HypotenuseCalc {

    public static void main(String[] args) {
        int a,b,c;
        double alan,cevre,u,alaninkaresi;
        Scanner inp=new Scanner(System.in);

        System.out.println("Birinci Kenar uzunlugu:");
        a=inp.nextInt();
        System.out.println("ikinci Kenar uzunlugu:");
        b=inp.nextInt();
        System.out.println("Ucuncu Kenar uzunlugu:");
        c=inp.nextInt();

        cevre=(a+b+c);
        u=(cevre/2);
        alaninkaresi= u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alaninkaresi);
        System.out.println("Ucgeninizin cevresi:"+cevre);
        System.out.println("Ucgeninizin alanı:"+alan);
    }

}
