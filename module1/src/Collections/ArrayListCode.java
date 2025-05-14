package Collections;

import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2); //O(1)
        list.add(3); //O(1)
        list2.add("Maahi");
        list3.add(true); // cannot store 1

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        String ele = list2.get(0);
        System.out.println("Element "+ele);
        System.out.println(list);
        list.set(0, 11);
        System.out.println(list);
list.add(1, 111);
        System.out.println(list);
    }
}
