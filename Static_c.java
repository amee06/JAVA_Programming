class Student {
    static String school = "XYZ school";
    
    void show(String name){
        System.out.println(name + " studies in " + school);
    }
}

public class Static_c {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show("max");
        obj.show("jack"); 
    }
    
}

//Static is used when variable or function in common for everyone
//it can not change and if it changed then apllied to all objects 