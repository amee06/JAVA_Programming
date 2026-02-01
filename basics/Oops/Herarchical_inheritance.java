class Parent {
    void greet() {
        System.out.println("Paretn class");
    }
}
class Child_1 extends Parent {
    void name(String name) {
        System.out.println("Base class 1 Name is " + name);
    }
}

class Child_2 extends Parent {
    void exit(){
        System.out.println("Base class 2");
    }
}

public class Herarchical_inheritance {
    public static void main(String[] args) {
        Child_1 obj = new Child_1();
        obj.greet();
        obj.name("Jack");

        Child_2 obj2 = new Child_2();
        obj2.greet();
        obj2.exit(); 
    }
}

//In hierarchical inheritance, multiple classes inherit from a single parent class.

//          Parent
//      /            \
//  Child_1     Chaild_2
