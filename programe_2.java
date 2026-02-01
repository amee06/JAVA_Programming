import java.util.Scanner;

public class programe_2 {
    class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year to check wherther it is leap or not :");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)){
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
}
