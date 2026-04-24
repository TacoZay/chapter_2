package exercises;
/*(Science: wind-chill temperature)
How cold is it outside? The temperature alone is not enough
to provide the answer. Other factors including wind speed, 
relative humidity, and sunshine play important roles in
determining coldness outside. In 2001, the National 
Weather Service(NWS) implemented the new wind-chill 
temperature to measure the coldness using temperature and 
wind speed. The formula is:
t_wc = 35.74 + 0.6215t_a - 35.75v^0.16 + 0.4275 * t_a * v^.16

t_a is the outside temperature measured in degrees Fahrenheit,
v is the speed measured in miles per hour, and t_wc is the
wind-chill temperature. The formula cannot be used for winds
below 2 mph or temperatures below -58F or above 41F

Write a program that prompts the user to enter a temperature
between -58G and 41F and a wind speed greater than or equal to 2
then displays the wind-chill temperature. */

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = sc.nextDouble();
        //Check to see if temp is within the range
        //this will close the program if the value is incorrect
        if(temp > 41 || temp < -58){
            System.out.println("Incorrect Temperature");
            System.exit(0);
        }


        System.out.print("Enter the wind (>=2) in miles per hour: ");
        double speed = sc.nextDouble();

        double index = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16)); 
        double scale = Math.pow(10, 5);

        double roundedIndex = Math.round(index * scale) / scale;
        System.out.println("The wind chill index is " + roundedIndex);
    }
}
