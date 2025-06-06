package CallByReference;

import java.util.Scanner;

public class Factorial {
    static long fact(int n){
        if(n==0 || n==1)return 1;

        long factorial = 1;

        for(int i=2; i<=n; i++){
            factorial=factorial*i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        long res = fact(n);
        System.out.println("Factorial of "+n+" is "+res);
    }
}
