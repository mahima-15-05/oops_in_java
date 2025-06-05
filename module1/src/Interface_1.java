 interface Interface_1 {
void  skip();
}

 class Min implements Interface_1{

    @Override
    public void skip() {
        System.out.println("Skipping...");
    }
}
class Main3{
    public static void main(String[] args) {
        Min m = new Min();
        m.skip();
    }
}