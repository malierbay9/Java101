package loops.fibonacci_series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int y=0,z=1,k;
    Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı fibonaci eleman sayısını giriniz: ");
    int x=scanner.nextInt();

        for (int i=1; i<=x; i++) {
        k=y+z;
        if(y==0)
            System.out.print(y);
        if(i==1)
            System.out.print("-"+i);

        System.out.print("-"+k);
        y=z;
        z=k;
    }
}
}
