public class CircularQueArray {

    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size= n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return (rear==-1 && front ==-1);
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if( isFull()){
                System.out.println("Queue is full");
                return;
            }
            // if we are adding first ele
            if(front==-1){
                front =0;
            }


            rear=(rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];


            //del last ele
            if(rear==front){
                rear=front=-1;
            }
            else{
                front= (front+1)%size;
            }
            return result ;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

    }



    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(6);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(100);

        while(!q.isEmpty()){
            System.out.print(q.peek()+"  ");
            q.remove();
        }




    }
}
