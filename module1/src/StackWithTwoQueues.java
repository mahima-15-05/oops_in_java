import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {
   static class Stack{
       static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        static void push(int data){
            q2.add(data);

            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            //copy

            Queue temp = q1;
            q1=q2;
            q2=temp;
        }

        static int pop(){
            return q1.remove();
        }

        static int top(){
            return q1.peek();
        }

        static boolean isEmpty(){
            return q1.isEmpty();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.print(s.top()+"  ");
            s.pop();
        }
        System.out.println("Stack with 2 queues");git 
    }
}
