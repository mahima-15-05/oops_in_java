package PracticeQuestions;

public class LinerSearch {
    static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,6,8,2,0};
        int target=90;

        System.out.println(linearSearch(arr, target));
    }
}
