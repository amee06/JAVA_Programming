class Animal {
    void eat() {
        System.out.println("eat function from prent class");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("sound function from base class");
    }
}

public class Single_inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        
        obj.eat();
        obj.sound();
    }
}

//a class inherits from one parent class only.
// Animal
//    ↓
//   Dog