public class CircularQueue {
    static int[] arr;
    static int front;
    static int rear;
    static int size;
    static int capacity;

    public CircularQueue(int n) {
        this.arr = new int[n];
        this.capacity = n;
        front = -1;
        rear = -1;
        size = 0;
    }

    //insert into queue (enqueue) add();
    static boolean add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        return true;

    }

    static boolean remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return false;
        }

        //if only 1 element
        if (front == rear) {
            front = rear = -1;

        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }

    static int front(){
        return arr[front];
    }
    static int rear(){
        return arr[rear];
    }
    static boolean isFull() {
        return capacity == size;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4); // full
        while(!cq.isEmpty()){
            System.out.print(cq.front()+" ");
            cq.remove();
        }

    }

}
