/*(Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate and then
computes the gratuity and total. For example, if the user enters 10 for subtotal and 12% for gratuity rate, the program
displays $1.2 as gratuity and $11.2 as total */
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //ask for the user input
        System.out.print("Enter the subtotal and the gratuity rate: ");
        double subtotal = sc.nextDouble(), gratuity = sc.nextDouble();
        
        //convert gratuity rate into decimal
        gratuity /= 100;

        //perform calculations
        double gratuityPrice = gratuity * subtotal;
        double total = gratuityPrice + subtotal;
        System.out.printf("The gratuity is $%.2f and the total is $%.2f", gratuityPrice, total);
        
    }    
}
