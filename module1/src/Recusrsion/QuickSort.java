package Recusrsion;

public class QuickSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[], int si, int ei){
        if (si >= ei) return ;
int pivot_index = solve(arr, si, ei);
        sort(arr,si, pivot_index -1);
        sort(arr,pivot_index+1, ei);

    }

    public static int solve(int arr[], int si, int ei){

        int len = arr.length;
        int pivot_index = ei;
        int pivot = arr[pivot_index];


        int i=si-1;

        for(int j=si; j<ei; j++){

            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]= arr[ei];
        arr[ei]= temp;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {7,5,4,2,9,0};
        System.out.println("Before sorting");
        print(arr);

        sort(arr, 0 , arr.length-1);
        System.out.println("After sorting");
        print(arr);


    }
}
