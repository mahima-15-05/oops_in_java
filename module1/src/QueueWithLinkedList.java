import java.util.*;

public class QueueWithLinkedList {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    static class Queue {
//        static Node head = null;
//        static Node tail = null;
//
//        static boolean isEmpty() {
//            return head == null && tail == null;
//        }
//
//        public static void add(int data) {
//            Node newNode = new Node(data);
//            if (isEmpty()) {
//                head = tail = newNode;
//                return;
//            }
//
//            tail.next = newNode;
//            tail = newNode;
//
//
//        }
//
//        public static int remove() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int front = head.data;
//            if (tail == head) {
//                tail = head = null;
//            } else {
//                head = head.next;
//            }
//            return front;
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//            int front = head.data;
//            return front;
//        }
//    }

    public static void main(String[] args) {
//        Queue q = new Queue();

       Queue<Integer> q = new ArrayDeque<>();
//       Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove(); // removes 1

        System.out.println("Peek : " + q.peek()); // prints 2

        // Iterate and print queue elements
        for (int val : q) {
            System.out.print(val + " ");
        }
    }
}
