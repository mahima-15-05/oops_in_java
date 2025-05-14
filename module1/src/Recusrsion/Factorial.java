package Recusrsion;

public class Factorial {
    static int fact;
    public static int factorial(int n) {
//        base case
         if(n==0)return 1;
        return n* factorial(n-1);


//         return fact;
    }

    public static void main(String[] args) {
        int n=4;
       int fact= factorial(n);
        System.out.println("Factorial is "+fact);
    }
}
