package CallByReference;

import java.util.Scanner;

public class BinomialCofficient {
    static long calculateFact(int n){
        long fact=1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=2; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int coff = (int)(calculateFact(n)/(calculateFact(n-r)* calculateFact(r)));
        System.out.println("Result "+coff);
    }
}
