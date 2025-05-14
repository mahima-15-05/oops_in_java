package Stacks;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String str){
        Stack<Character> s = new Stack<>();

        int index=0;
        while(index < str.length()){
            s.push(str.charAt(index));
            index++;

        }
        int i=0;
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char top = s.pop();
            result.append(top);



        }
//        System.out.println(result);
        str = result.toString();
//        System.out.println(str);
return str;

    }
    public static void main(String[] args) {
        String s = "abc";
         s = reverse(s);
        System.out.println(s);
    }
}
