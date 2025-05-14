package Collections;

import java.util.ArrayList;

public class MaxInArrayList {
    public static void findMax(ArrayList<Integer> ls){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<ls.size(); i++){
            if(max<ls.get(i)){
                max= ls.get(i);
            }
        }
        System.out.println("Max is "+max);
    }

    public  static void swap(ArrayList<Integer> ls, int indx1, int indx2){
        int temp = ls.get(indx1);
        ls.set(indx1, ls.get(indx2));
        ls.set(indx2, temp);
        System.out.println(ls);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(1222);
        ls.add(22);
        ls.add(32);
        ls.add(244);
//        findMax(ls);
        System.out.println(ls);
        swap(ls, 0, 4);
    }
}
