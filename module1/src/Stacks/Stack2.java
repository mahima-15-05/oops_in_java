package Stacks;

public class Stack2 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head ==null;
        }

        public static void push(int data){
            Node newNode = new Node( data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next=head;
            head = newNode;
        }

        public static int pop(){

            if(isEmpty()){
                return -1;
            }

            int val = head.data;
            head = head.next;

            return val;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }

        public static void print(){
            if(isEmpty()){
                System.out.println("Stack is currently empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"  ");
                temp=temp.next;

            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.print();
        System.out.println("top - "+st.peek());
        st.pop();
        st.print();


    }
}
