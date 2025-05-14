
class Animal {
    String color;
    void eat(){
        System.out.println("Eating");
    }void breathe(){
        System.out.println("Breathing");
    }
}

class Fish extends Animal{
    int swimmingRate;

    void movingFins(){
        System.out.println("Moving fins");
    }
//    void eat(){
//
//    }
}
public class Main {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
        f1.movingFins();
        System.out.println(f1.color);
    }
}