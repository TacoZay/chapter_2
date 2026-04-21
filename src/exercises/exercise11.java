package exercises;
/*Rewrite programming exercise 1.11 to prompt the user to 
enter the number of years and display the population after the
number of years */

import java.util.Scanner;

public class exercise11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pop = 312032486;

        System.out.println("The current population is " + pop);
        System.out.print("Enter the number of years to see the population change: ");
        int years = sc.nextInt();

        int birthsInADay = (int) (86400 /7.0);
        int deathsInADay = (int) (86400/13.0);
        int immigrantsInADay = (int)(86400/45.0);


        int birthsInAYear = birthsInADay * (365 * years);
        int deathsInAYear = deathsInADay * (365 * years);
        int immigrantsInAYear = immigrantsInADay * (365 * years);

        int newPop = pop + (immigrantsInAYear + birthsInAYear) - deathsInAYear;

        System.out.printf("After %d year(s), the population will be %d", years, newPop);
    }
}