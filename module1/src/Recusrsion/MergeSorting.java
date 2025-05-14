package Recusrsion;

public class MergeSorting {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei)return;

        int mid = si + (ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

//    public static void merge(int arr[], int si,int mid,int ei){
//        if(si>=ei)return;
//        int k=0;
//        int i=si; int j=mid+1;
//        int [] temp=new int [ei-si+1];
//        while(i <= mid && j<=ei){
//            if(arr[i]< arr[j]){
//                temp[k]=arr[i];
//                i++;
//            }
//            else{
//                temp[k]=arr[j];
//                j++;
//            }
//
//            k++;
//        }
//
//        while(i<=mid){
//            temp[k]=arr[i];
//            k++;
//            i++;
//        }
//        while(j<=ei){
//            temp[k]=arr[j];
//            k++;
//            j++;
//        }
//
//        for(k=0, i=si; k<temp.length; k++, i++){
//            arr[i] = temp[k];
//
//        }
//    }

    public static void merge(int arr[], int si, int mid, int ei){
        int i=si;
        int j =mid+1;
        int temp[] = new int[ei-si+1];
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }

        //copying in org array

        for(i=si, k=0; k<temp.length; i++,k++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 0, 2, 3, 1};
        System.out.println("Before sorting:");
        print(arr);
        System.out.println(); // newline

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        print(arr);
    }
}
