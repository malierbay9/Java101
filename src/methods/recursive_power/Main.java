package methods.recursive_power;

public class Main {
    public static void main(String[] args) {
    System.out.println(power(5, 2));
}

    static int power(int sayi, int üs) {

        if (üs == 0) {
            return 1;
        }

        int result = 1;
        result = power(sayi, üs - 1) * sayi;
        return result;

    }
}
