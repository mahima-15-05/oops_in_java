package Stacks;

import java.util.ArrayList;

public class Stack1 {
    public static class Stack{
        static ArrayList <Integer> ls = new ArrayList<>();

        public static boolean isEmpty(){
            return ls.size()==0;
        }

        //push
        public static void push(int data){
            ls.add(data);


        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = ls.get(ls.size()-1);

            ls.remove(ls.size()-1);// index  O(1)
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = ls.get(ls.size()-1);

            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }





    }
}
