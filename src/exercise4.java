/*(Conver square meters into ping) Write a program that converts square meter into ping. The program prompts the user
to enter a number in square meter, converts it to ping, and displays the result. One square meter is 
0.3025 ping. Here is a sample run:

Enter a number in square meters: 50 
50.0 square meters is 15.125 pings*/

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
