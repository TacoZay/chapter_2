package exercises;
/*Write a program that calculates the energy needed to heat water from an initial temperature
to a final temperature. Your program should prompt the user to enter the amount of water in 
kilograms and the initial and final temperatures of the water. The formula to compute the 
energy is:
Q = M *(finalTemperature - initialTemperature) * 4184

Q is energy measured in joules, 
M is the weight of water in kilograms
the temperature are in degrees Celsius */
import java.util.Scanner;

public class exercise10 {
     public static void main(String[] args){
        //Create a scanner object
        Scanner sc = new Scanner(System.in);

        //1. User input the weight of water and the temperature
        double weight = 0;
        double initialTemp = 0;
        double finalTemp = 0;


        System.out.print("Enter the amount of water in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemp = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemp = sc.nextDouble();

        //2. compute the formula Q = M *(finalTemperature - initialTemperature) * 4184
        double energy = weight * (finalTemp - initialTemp) * 4184;

        //3.Display the results
        System.out.printf("The energy needed is %.1f", energy);

     }
}
