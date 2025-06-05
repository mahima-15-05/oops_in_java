public abstract class Abstraction {


    public void eat(){
        System.out.println("Eating");
    }
    public abstract void sleep();
}
class Animal3 extends Abstraction{


    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
class Main1{
    public static void main(String[] args) {
        Animal3 a3 = new Animal3();
        a3.eat();
        a3.sleep();
    }
}
