package conditions.flight_ticket_price_calc;

import java.util.Scanner;

public class FlightTicketCalc {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        float mesafebasi = 0.10f;
        int mesafe = 0,yas=0,yolculuktipi=0;
        float ucret;
        System.out.print("Mesafeyi km turunden giriniz : ");
        mesafe = oku.nextInt();

        System.out.print("Yasinizi giriniz : ");
        yas = oku.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus) : ");
        yolculuktipi = oku.nextInt();

        if(yas > 0 && mesafe > 0 && (yolculuktipi == 1 || yolculuktipi == 2))
        {
            ucret = (mesafebasi * mesafe) * yolculuktipi;
            if(yas < 12)
                ucret = ucret - ((ucret * 50) / 100);
            if(yas > 12 && yas < 24)
                ucret = ucret - ((ucret * 10) / 100);
            if(yas > 65)
                ucret = ucret - ((ucret * 30) / 100);

            if(yolculuktipi == 2)
                ucret = ucret - ((ucret * 20) / 100);

            System.out.print("Odemeniz gereken ucret : "+ ucret);
        }
        else
            System.out.print("Hatali giris yaptiniz.");
    }
}
