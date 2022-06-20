package basics_and_variables.body_mass_index_calc;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        float boy,kilo,vki;

        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy = oku.nextFloat();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = oku.nextFloat();

        vki = kilo / (boy * boy);

        System.out.print("Vucut Kitle Indeksiniz :" + vki);
    }

}
