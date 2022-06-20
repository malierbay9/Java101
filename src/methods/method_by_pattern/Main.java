package methods.method_by_pattern;

public class Main {
    public static void main(String[] args) {
    // 16 11 6 1 -4 1 6 11 16
    int a=23;
    int temp=a;
    int temp2=a;

    System.out.println(pattern(a,temp,temp2));
}

    static int pattern(int a, int temp, int temp2){

        if(a<=0){
            if(temp<temp2){
                System.out.println(temp);
                return pattern(a,temp+5,temp2);}
            else
                return temp2;


        }
        System.out.println(a);
        return pattern(a-5,temp-5,temp2);
    }
}
