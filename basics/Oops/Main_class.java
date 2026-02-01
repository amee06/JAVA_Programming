class Parent {
    void greet() {
        System.out.println("This is prent class");
    }
}

class Base_class1 extends Parent {
    void greet() {
        super.greet(); //print the prent class content too
        System.out.println("Base class 1");
    }
}

class Base_class2 extends  Parent {
    void greet() {
        System.out.println("Base class 2");
    }
}

public class Main_class {
    public static void main(String[] args) {
        Parent obj1;
        obj1 = new Base_class1();
        obj1.greet();

        obj1 = new Base_class2();
        obj1.greet();

    }
}

