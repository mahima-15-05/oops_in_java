package PracticeQuestions;

public class BinToDec {
    static int convertBinaryToDecimal(int n){ // n=  1 1 1
        int result=0;
        int cnt =0;
        while(n>0){
            int ld = n%10;
            result = (int)(result + ld*Math.pow(2,cnt));
            cnt++;
            n=n/10;
        }


        return result;
    }
    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal(1000));
    }
}
