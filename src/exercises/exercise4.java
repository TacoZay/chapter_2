package exercises;



//import scanner
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        //created scanner object 
        Scanner sc = new Scanner(System.in);

        //asks the user for input
        System.out.print("Enter a number in square meters: ");
        double meters = sc.nextDouble();

        //perform calculation to convert meters to ping
        double result = meters * 0.3025;

        //prints the result
        System.out.println(meters + " square meters is " + result + " pings");

    }
}
