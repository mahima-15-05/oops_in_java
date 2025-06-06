package PracticeQuestions;

public class DecimalToBin {
    static int decToBin(int n){
        int res=0;
        int cnt=0;
        while(n>0){
         int ld = n%2;
         res = res+(int)(ld*Math.pow(10,cnt));
         cnt++;
         n=n/2;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decToBin(8));
    }
}
