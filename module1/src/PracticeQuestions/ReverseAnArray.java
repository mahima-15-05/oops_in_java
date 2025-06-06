package PracticeQuestions;

public class ReverseAnArray {
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    void reverseArray(int arr []){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }

    static void pairsInAnArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+", "+arr[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ReverseAnArray r = new ReverseAnArray();
        int arr[] = {2,3,4,5,6,7};

        System.out.println("Before reversing : ");
        print(arr);
        r.reverseArray(arr);
        System.out.println("After reversing : ");
        print(arr);
        System.out.println();
        pairsInAnArray(arr);
    }
}
