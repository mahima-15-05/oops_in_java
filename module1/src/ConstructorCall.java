class Animals{
    Animals(){
        System.out.println("Animal Constructor called ...");
    }
}
class Mammals extends Animals{
    Mammals(){
        System.out.println("Mammals Constructor called ...");
    }
}
class Baby extends  Mammals{
    Baby(){
        System.out.println("Baby Constructor called ...");
    }
}



public class ConstructorCall {
    public static void main(String[] args) {
        Baby baby = new Baby();
    }
}
