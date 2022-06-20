package conditions.class_passing_condition;

import java.util.Scanner;

public class ClassPassingCondition {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);

            System.out.print("Matematik notunu giriniz : ");
            int mat = inp.nextInt();

            System.out.print("Turkce notunu giriniz : ");
            int turkce = inp.nextInt();

            System.out.print("Fizik notunu giriniz : ");
            int fizik = inp.nextInt();

            System.out.print("Kimya notunu giriniz : ");
            int kimya = inp.nextInt();

            System.out.print("Muzik notunu giriniz : ");
            int muzik = inp.nextInt();

            int average = 0 , counter = 0;

            if(mat!=0 && mat!=100) {
                average +=mat;
                counter++;
            }

            if(turkce!=0 && turkce!=100) {
                average +=turkce;
                counter++;
            }

            if(fizik!=0 && fizik!=100) {
                average +=fizik;
                counter++;
            }

            if(kimya!=0 && kimya!=100) {
                average +=kimya;
                counter++;
            }

            if(muzik!=0 && muzik!=100) {
                average +=muzik;
                counter++;
            }

            double conclusion = (double)average/counter;

            if(conclusion>54) {
                System.out.println("Geçtiniz Tebrikler !!!");
            }
            else {
                System.out.println("Sinifta kaldiniz seneye daha iyi calisiniz.");
            }

            System.out.println("Not ortalamaniz : " + conclusion);
            inp.close();
    }
}
