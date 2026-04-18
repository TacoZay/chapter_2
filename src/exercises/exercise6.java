package exercises;
/*(Sum the digits in an integer) Write a program that reads an integer between 0 & 1000 and adds all of the
digits in the integer. For example, if the integer is 932, the sum of all its digits is 14
Hint: use the % to extract digits and use the / operator to remove the extracted digits. For example 932 % 10 = 2
and 932 / 10  */

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args){
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //ask the user for input
        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();

        int result = 0;
        //perform the calculations
        while(number != 0){
        //use the module operator
        result += number % 10;
        number /= 10;
        }

        System.out.println("The sum of the digits is "+ result);


    }
}
