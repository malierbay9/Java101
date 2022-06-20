package conditions.chinese_zodiac_calc;

import java.util.Scanner;

public class ChineseZodiacCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yıl;

        System.out.println("Doğum yılınızı giriniz: ");
        yıl = input.nextInt();

        switch (yıl%12) {
            case 0:
                System.out.println("Maymun Burcusunuz");
                break;

            case 1:
                System.out.println("Horoz Burcusunuz");
                break;

            case 2:
                System.out.println("köpek Burcusunuz");
                break;

            case 3:
                System.out.println("Domuz Burcusunuz");
                break;

            case 4:
                System.out.println("Fare Burcusunuz");
                break;

            case 5:
                System.out.println("Öküz Burcusunuz");
                break;

            case 6:
                System.out.println("Kaplan Burcusunuz");
                break;

            case 7:
                System.out.println("Tavşan Burcusunuz");
                break;

            case 8:
                System.out.println("Ejderha Burcusunuz");
                break;

            case 9:
                System.out.println("yılan Burcusunuz");
                break;

            case 10:
                System.out.println("At Burcusunuz");
                break;
            case 11:
                System.out.println("Koyun Burcusunuz");
                break;

            default:
                System.out.println("You are alien, we detected you :)");
                break;
        }
    }
}
