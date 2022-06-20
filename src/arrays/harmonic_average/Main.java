package arrays.harmonic_average;

public class Main {
    public static void main(String[] args) {
        double[] arr={1,2,3};
        double sum=0;
        for(double i:arr){
            sum+=1/i;
        }
        double average= arr.length/sum;
        System.out.println("Harmonik ortalama: "+ average);

    }
}
