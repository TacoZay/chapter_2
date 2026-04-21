package exercises;
/*(Financial application: compound value) Suppose you save
$100 each month in a savings account with annual interest
of 3.75%. Thus, the monthly interest rate is 
0.0375/12 = .003125. After the first month, the value in 
account becomes
100 * (1 + 0.003125) = 100.3125
After the second month, the value in the account becomes
(100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes
(100 + 200.938) * (1 + 0.003125) = 301.878

Write a program that prompts the user to enter a monthly
savings amount and plays the account value after sixth the 
sixth month*/
import java.util.*;
public class exercise13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savings = sc.nextDouble();

        double interest = (1 + 0.003125);
        double firstMonth = savings * interest;
        double secondMonth =(100 + firstMonth) * interest;
        double thirdMonth =(100 + secondMonth) * interest;
        double fourthMonth =(100 + thirdMonth) * interest;
        double fifthMonth =(100 + fourthMonth) * interest;
        double sixthMonth =(100 + fifthMonth) * interest;

        System.out.println(
            "After the first month, the account value is " + firstMonth +"\n"+
            "After the second month, the account value is " + secondMonth +"\n"+
            "After the third month, the account value is " + thirdMonth +"\n"+
            "After the first month, the account value is " + sixthMonth
        );
    }
}
