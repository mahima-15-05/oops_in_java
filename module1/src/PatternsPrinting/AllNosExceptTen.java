package PatternsPrinting;

import java.util.Scanner;

public class AllNosExceptTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while(true){
            System.out.println("Enter n or (-1 to exit): ");
            n = sc.nextInt();
            if(n%10==0)continue;
            if(n==-1)break;

            System.out.println(n);
        }

    }
}
