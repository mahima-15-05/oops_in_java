interface Carnivore{
    void eatPlant();
}interface Herbivore{
    void eatAnimal();
}

class Bear implements Carnivore,Herbivore{

    @Override
    public void eatPlant() {
        System.out.println("Eating plant");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Eating Animal");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatPlant();
        bear.eatAnimal();
    }


}
