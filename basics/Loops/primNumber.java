package Loop;
import java.util.Scanner;

public class primNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Starting rang :  ");
        int start = scan.nextInt();

        System.out.println("Enter Ending range : ");
        int end = scan.nextInt();
        boolean isPrime = false;

        for(int i = start; i <= end; i++){
            for(int j = 1; j <= i/2; j++){
                if(i % j != 0){
                    isPrime = true;
                } else {
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i + " Prime");
            } 
        }
        scan.close();
    }
}
