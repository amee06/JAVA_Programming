class Animal {
    void eat() {
        System.out.println("eat function from prent class");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("sound function from parent-base class");
    }
}

class Cat extends Dog {
    void walk() {
        System.out.println("walk class from base-base class");
    }
}

public class Maltileavel_inheritance {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eat();
        obj.sound();
        obj.walk();
    }
}

//a class inherits from a parent class, and another class inherits
//from this child class, forming a chain.

//   Animal
//     ↓
//    Dog
//     ↓
//    Cat