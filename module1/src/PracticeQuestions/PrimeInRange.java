package PracticeQuestions;

public class PrimeInRange {

    static boolean isPrime(int n){
        if(n<2)return false;

        for(int i=2; i<n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
    static void printAllPrime(int n){
        if(n<2) {
            System.out.println("No prime numbers in range");
            return;
        }
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }


    }
    public static void main(String[] args) {
        printAllPrime(20);
    }
}
