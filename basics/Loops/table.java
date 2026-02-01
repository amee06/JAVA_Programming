package Loop;
import java.util.Scanner;

class table {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number : ");
        int num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num  + " * " + i +" = " + (num*i));
        }
        scan.close();
    }
}