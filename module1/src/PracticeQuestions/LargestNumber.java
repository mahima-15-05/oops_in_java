package PracticeQuestions;

import java.util.Scanner;

public class LargestNumber {
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    static int largestNum(int arr[]){
        if(arr.length==0)return -1;
        int max_val = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max_val)max_val=arr[i];

        }
        return max_val;
    }
    public static void main(String[] args) {
        int arr[] =new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();
        System.out.println(largestNum(arr));
    }
}
