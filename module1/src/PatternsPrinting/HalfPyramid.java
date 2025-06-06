package PatternsPrinting;

public class HalfPyramid {
    /*
    * 1
    * 1 2
    * 1 2 3
    * 1 2 3 4
    * 1 2 3 4 5
    */

    static void printPyramid(int n){
        for(int i=1; i<=n;i++ ){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void printCharPyramid(int n){
        /*
        * A
        * A B
        * A B C
        * A B C D
        * A B C D E
        */

        for(char i ='A'; i<'A'+n;i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void printCharPyramidDistinct(int n){
        /*
         * A
         * B C
         * D E F
         * G H I J
         * K L M N O
         */
        char a ;
        int cnt =0;
        for(int i=0; i<n; i++){

            for(int j=0; j<=i; j++){
                a = (char) ('A'+cnt);
                System.out.print(a+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    static void printHollowRectangle(int n){
        /*
        *  * * * * *
        *  *       *
        *  *       *
        *  *       *
        *  * * * * *
        */

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1  || i==n || j==1 || j==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    static void invertedPyramidStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n-i+1<=j) System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        int n = 4;
//      printPyramid(n);

//        printCharPyramid(n);
//        printCharPyramidDistinct(n);
//          printHollowRectangle(n);
        invertedPyramidStar(n);
    }
}
