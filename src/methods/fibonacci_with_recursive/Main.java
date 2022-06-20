package methods.fibonacci_with_recursive;

public class Main {
    public static int fibb(int n){
        if(n==1||n==2){
            return 1;
        }

        return fibb(n-1)+fibb(n-2);


    }

    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21

        // f(n) = f(n-1)+f(n-2)
        // f(6) = f(5)+f(4)
        //      .
        //      .
        //      .

        System.out.println(fibb(5));
    }
}
