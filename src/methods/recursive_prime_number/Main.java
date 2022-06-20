package methods.recursive_prime_number;

public class Main {
    public static void main(String[] args) {

    System.out.println(isPrime(7,2));

}

    static boolean isPrime(int n, int i ){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * 2 > n)
            return true;
        return isPrime(n, i + 1);
    }
}
