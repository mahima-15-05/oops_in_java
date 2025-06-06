package CallByReference;

public class OptimumCalculationOfFact {

    static long calBinomialCoff(int n, int r){
        long res = 1;
        if(r>n)return 0;

        for(int i=0; i<r; i++){
            res = res* (n-i);
            res = res/(i+1);


        }
        return res;
    }
    public static void main(String[] args) {
        int n = 10;
        int r = 3;

        System.out.println(calBinomialCoff(n,r));

    }
}
