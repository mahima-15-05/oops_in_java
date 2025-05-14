package LinkedListCodes;

public class SearchInLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }


    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step - 1: create a node
            Node newNode = new Node(data);
            size++;
        // if list is empty

        if(head==null){
            head = tail = newNode;
            return;
        }

        //step - 2: if list is not empty
        newNode.next = head;
        head=newNode;


        //step - 3: create a node
    }

    public void printList(){
        Node temp=head;;

        while(temp!=null){
            System.out.print(temp.data+" -> ");

            temp=temp.next;

        }
        System.out.println("null");
    }

    public int search(int target){
        if(head==null){
            System.out.println("List is empty");
            return -1;
        }

        //if one element
        if(size==1){
            if(head.data==target){
                return 0;
            }else{
                return -1;
            }
        }

        //is size is more than 1;
        int i=0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == target)return i;
            temp=temp.next;
            i++;

        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInLinkedList ll = new SearchInLinkedList();
        ll.addFirst(1);
        ll.addFirst(21);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(15);
        ll.addFirst(11);
        ll.addFirst(5);
        ll.printList();

        System.out.println("Element is at index "+ll.search(1));
        System.out.println("Element is at index "+ll.search(222));

    }


}
