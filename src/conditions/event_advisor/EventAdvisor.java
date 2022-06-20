package conditions.event_advisor;

import java.util.Scanner;

public class EventAdvisor {
    public static void main(String[] args) {

            int heat;

            Scanner input = new Scanner(System.in);
            System.out.print("Sıcalık Giriniz: ");
            heat = input.nextInt();

            boolean control1;
            boolean control2;
            boolean control3;
            boolean control4;

            control1 = (heat < 5);
            control2 = (heat >= 5 && heat < 15);
            control3 = (heat >=10 && heat <25);
            control4 = (heat >= 25);

            String onerme1 = control1 ? "Kayağa gidebilirsin." : "" ;
            String onerme2 = control2 ? "Sinemaya gidebilirsin." : "";
            String onerme3 = control3 ? "Pikniğe gidebilirsin." : "";
            String onerme4 = control4 ? "Yüzmeye gidebilirsin." : "";

            System.out.println(onerme1);
            System.out.println(onerme2);
            System.out.println(onerme3);
            System.out.println(onerme4);
    }
}
