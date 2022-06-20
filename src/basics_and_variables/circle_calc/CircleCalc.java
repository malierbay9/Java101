package basics_and_variables.circle_calc;

import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        double r, alan, pi=3.14,cevre,a,dilimalani;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:");
        r=inp.nextDouble();
        System.out.print("Daire diliminin acisini giriniz:");
        a=inp.nextDouble();
        alan=(pi*r*r);
        cevre=2*pi*r;
        dilimalani=(pi*(r*r)*a)/360;
        System.out.println("Daire'nin tam alani:"+alan);
        System.out.println("Daire'nin tam cevresi:"+cevre);
        System.out.println("Sectiniz dilimin alani:"+dilimalani);
    }
}
