package Collections;

import java.util.ArrayList;

public class MuldArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList> main_list = new ArrayList<>();

        ArrayList<Integer> ls1= new ArrayList<>();
//        ls1.add(1);
//        ls1.add(2);
//        ls1.add(3);
//
        ArrayList<Integer> ls2 = new ArrayList<>();
//        ls2.add(7);
//        ls2.add(8);
//        ls2.add(9);
//
//        main_list.add(ls1);
//        main_list.add(ls2);
//
//        System.out.println(main_list);
//        System.out.println(ls1);
//        System.out.println(ls2);
        ArrayList<Integer> ls3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            ls1.add(i*1);
            ls2.add(i*2);
            ls3.add(i*3);
        }
        main_list.add(ls1);
        main_list.add(ls2);
        main_list.add(ls3);
        System.out.println(main_list);

        for(int i=0; i<main_list.size(); i++){
            ArrayList<Integer> curr_list = main_list.get(i);
            for(int j=0; j<curr_list.size(); j++){
                System.out.print(curr_list.get(j));
            }
            System.out.println();
        }




    }
}
