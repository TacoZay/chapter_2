package exercises;
/*(Convert meters into feet) Write a program that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet. Here is a sample run:

Enter a value for meter: 10
10.0 meters is 32.786 feet*/


import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args){
        //Create scanner object 
        Scanner sc = new Scanner(System.in);

        //Print statement
        System.out.print("Enter a value for meter: ");

        //perform calculation
        double meters = sc.nextDouble();
        double result = meters * 3.2786;

        //print the result
        System.out.print(meters + " meters is "+result+ " feet");
    }
}
