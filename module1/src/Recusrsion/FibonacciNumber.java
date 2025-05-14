package Recusrsion;

public class FibonacciNumber {
    public static int nthFibNum(int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }


       return nthFibNum(n-1)+nthFibNum(n-2);





    }
    public static void main(String[] args) {

        int n=10;
        int sum = nthFibNum(n);
        System.out.println(sum);
    }
}
