


public class MergeSort {

    public static void printArray(int arr[]){
        System.out.println("Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei)return;
        int mid = si+ (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k=0; //iterator for temporary arr

        while(i<=mid && j<=ei){
           if(arr[i]<arr[j]){
               temp[k]= arr[i];
               i++; k++;
           }
           else{
               temp[k]=arr[j];
               j++; k++;
           }
        }

        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            k++;
            j++;

        }

        //copy temp into original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]= temp[k];

        }
    }

    public static void main(String[] args) {
        int a[] ={8,2,7,3,4,5,0,6};

        printArray(a);
        mergeSort(a, 0 , a.length-1);
        printArray(a);


    }
}
