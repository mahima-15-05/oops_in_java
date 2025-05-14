package Recusrsion;

public class SumOfNums {
    public static int sumOfNums(int n) {
        // base case
        if(n==0)return 0;
        return n+ sumOfNums(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        int sum = sumOfNums(n);
        System.out.println("Sum is "+sum);
    }
}
