/*(Find the number of years) Write a program that prompts the user to enter the 
minutes and displays the maximum number of years and remaining days for the minutes.
For simplicity, assume that a year has 365 days. Here is a sample run:

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days*/
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args){
        //asks the user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");

        //Divide total minutes by 525600 using integer division
        int minutes = sc.nextInt();
        int minutesInYear = 525600;
        int years = minutes / minutesInYear;

    
        //Use the modulo operator to see the remaining minutes
        int remainingMinutes = minutes % minutesInYear;
        
        //use the # of minutes in day and divide it from the remainingMinutes
        int minutesInDay = 1440;

        int days = remainingMinutes / minutesInDay;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
        

    }
}
