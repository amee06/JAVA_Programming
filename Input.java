import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        //creat scanner clss object
        Scanner sc = new Scanner(System.in);
        
        //for input interger
        System.out.println("Enter number : ");
        int num1 = sc.nextInt();
        System.out.println("Your number : " + num1);

        System.out.println("Enter secound number : ");
        int num2 = sc.nextInt();
        System.out.println("Secound number : " + num2);

        System.out.println("Sum of your enter number = " + (num1 + num2));

 // ***** ADD THIS LINE TO CONSUME THE NEWLINE *****
        sc.nextLine();  // This reads the leftover \n from nextInt()

        //input whole massage
        System.out.println("Enter any massage : ");
        String msg = sc.nextLine();
        System.out.println("massage = " + msg);

        //input just one word as token
        System.out.println("Enter you name : ");
        String name = sc.next();
        System.out.println("Name = " + name);

    }
    
}

