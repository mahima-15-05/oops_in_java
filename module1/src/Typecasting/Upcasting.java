package Typecasting;

class Animal{
    void eat(){
        System.out.println("Eating");
    }


}

 class Cat extends Animal {
     void greet(){
        System.out.println("Hii from Cat");
    }
}
public class Upcasting{
    public static void main(String[] args) {
        Animal a = new Cat();
        Cat c = (Cat)a;
//        a.eat();
//        c.greet();
//        c.eat();

        long a2=1232456782;
        int a1 =10;
        double d = a1;
        double e = a2;
        System.out.println("Double "+e);
    }
}
