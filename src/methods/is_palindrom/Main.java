package methods.is_palindrom;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("============================");
            System.out.println("Sayı: " + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı: " + reverseNumber);
            temp /= 10;

        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(2442));

    }
}
