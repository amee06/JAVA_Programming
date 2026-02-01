package Operator;
import java.util.Scanner;

public class simple_interst {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int p = scan.nextInt();

        System.out.println("Enter Interst : ");
        int i = scan.nextInt();

        System.out.println("Enter Time : ");
        int t = scan.nextInt();

        double simpleInterst =  (p * i * t) / 100;
        System.out.println("Simple interst = " + simpleInterst);

        scan.close();
    }
}
