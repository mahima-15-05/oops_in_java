package Recusrsion;

class PrintNum{

    int fun(int n){
        // base class
        if(n==0)return 0;

        // kaam
        System.out.print(n+" ");

        // recursive call
        fun(n-1);
        return 0;
    }
        }
public class Recursion1 {

    // fun to print n to 1


    public static void main(String[] args) {
        int n=10;

        PrintNum pt = new PrintNum();
        pt.fun(n);
    }
}
