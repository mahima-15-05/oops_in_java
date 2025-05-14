package LinkedListCodes;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static  Node tail;

    public static int size;
    public void addFirst(int data){

        //Step 1: Create new node
        Node newNode = new Node(data);
        size++;


        // if linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //if not empty-perform step 2 and step 3



        //Step 2: newNode.next ---> head

        newNode.next=head; // here we are creating a link

        //Step 3: head--> newNode

        head=newNode;
    }

    public void addLast(int data){

        //create new node
        Node newNode =new Node(data);
        size++;


        if(head==null){
                tail=head=newNode;
                return;
            }

            //
        tail.next = newNode;
            tail = newNode;
        }

        public void printLinkedList(){

        if(head==null){
            System.out.println("The Linked List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->  ");
            temp = temp.next;
            }
            System.out.println("null");
        }

        public void addAtIndex(int index, int data){
        //create node
            Node newNode = new Node(data);


            if(index==0){
                addFirst(data);
                return;
            }
            size++;

            if(head==null){
                System.out.println("Linked list is empty");
                return;
            }




                Node temp = head;
                int i=0;
                while(i < index-1 && temp!=null){
                    temp=temp.next;
                    i++;


                }
            // if temp==null
            if(temp==null){
                System.out.println("Invalid index");
                return;
            }
            newNode.next = temp.next;
            temp.next=newNode;

            if(newNode.next == null){
                tail = newNode;

            }



        }

        public int  sizeOflist(){
        if(head==null)return 0;

        Node temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;

        }

        //Remove node from linked list
    //removeFirst

    public int  removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;

        }
        // size is more than 1
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    //removeLast

    public int removeLast(){
        // if list is empty
        if(head==null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail = null;
            size=0;
            return val;

        }

        int i=0;
        Node prev = head;
        while(i<size-1-1){
            prev=prev.next;
            i++;

        }
        int data = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return data;

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.printLinkedList();

        ll.addFirst(2);
        ll.printLinkedList();

        ll.addFirst(3);
        ll.printLinkedList();


        ll.addLast(9);
        ll.printLinkedList();

        ll.addLast(8);
        ll.printLinkedList();

        ll.addLast(7);
        ll.printLinkedList();
//
//        ll.addAtIndex(2,90);
//        ll.printLinkedList();
//        System.out.println("Size "+ll.size);

        ll.removeFirst();
        System.out.println("after removing first");
        ll.printLinkedList();

        ll.removeLast();
        System.out.println("after removing last");
        ll.printLinkedList();

        ll.removeLast();
        System.out.println("after removing last");
        ll.printLinkedList();

        ll.removeLast();
        System.out.println("after removing last");
        ll.printLinkedList();

        ll.removeLast();
        System.out.println("after removing last");
        ll.printLinkedList();

        System.out.println(ll.size);


    }
}
