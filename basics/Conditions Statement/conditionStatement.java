//Statement
//Age Category Classifier: Write a program that takes age as input and categorizes: Child (0-12), Teen (13-19), Adult (20-59), Senior (60+)

import java.util.Scanner;

public class conditionStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        if(age >= 0 && age <= 12){
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age >= 20 && age <= 40){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        sc.close();
    }
}




