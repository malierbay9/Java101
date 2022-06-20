package conditions.user_entry;

import java.util.Scanner;

public class UserEntry {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String username = "admin",userpass="1234";
        String enterusername,enteruserpass,controller;

        System.out.print("Enter the username : ");
        enterusername = oku.next();

        System.out.print("Enter the user pass :");
        enteruserpass = oku.next();

        if(enterusername.equals(username)) {
            if (enteruserpass.equals(userpass)) {
                System.out.print("Girisiniz yapildiniz,hosgeldiniz.");
            }
            else {
                System.out.print("Sifreniz yanlis,degistirmek ister misiniz? (1- Evet / 2 - Hayir) : ");
                controller = oku.next();

                if(controller.equals("1")){
                    System.out.print("Sifrenizi giriniz :");
                    enteruserpass = oku.next();
                    if (enteruserpass.equals(userpass)) {
                        System.out.print("Eski sifreniz ile ayni olamaz,sifre olusturulamadi. :");
                    } else {
                        System.out.print("Yeni sifreniz olusturuldu.");
                    }
                }
                else
                {
                    System.out.print("Sifre olusturmaktan vazgectiniz.");
                }
            }
        }
        else
            System.out.print("Kullanici adi ve sifre yanlistir.");
    }
}
