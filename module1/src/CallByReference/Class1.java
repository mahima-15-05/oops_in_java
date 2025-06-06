package CallByReference;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

public class Class1 {

    static void changeName(Person p){
        p.name ="Maahi";
    }

    public static void main(String[] args) {
        Person p = new Person("Alice");
        changeName(p);
        System.out.println(p.name);
    }
}
