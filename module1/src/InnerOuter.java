public class InnerOuter {
    static int a = 10;
   static class InnerClass{
        void print(){
            System.out.println("Value "+a);
        }
    }

    public static void main(String[] args) {
//        InnerOuter out = new InnerOuter();
//        InnerOuter.InnerClass in = out.new InnerClass();
//        in.print();

        InnerClass ine = new InnerClass();
    }
}
