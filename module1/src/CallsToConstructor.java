public class CallsToConstructor {

    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.color);
    }
}

class Animalss{
    String color;
    Animalss(){
        System.out.println("Animalss constructor is called");
    }
}
class Horse extends Animalss{
    Horse(){
//        super();
        super.color="Yellow";
        System.out.println(color);
        System.out.println("Horse constructor is called");

    }
}
