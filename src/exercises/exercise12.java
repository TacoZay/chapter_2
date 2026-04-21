package exercises;
/* (Physics: finding runway length)
Given an airplane's acceleration a and take-off speed v,
you can compute the minimum runway length needed for an 
airplane to take off using the following formula:

length = v^2/2a

Write a program that prompts the user to enter v in 
meters/second(m/s) and the acceleration a in meters/second
squared (m/s^2), then display the minimum runway length
 */

import java.util.*;
public class exercise12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double speed = 0;
        double accel = 0;

        System.out.print("Enter speed and acceleration: ");
        speed = sc.nextDouble();
        accel = sc.nextDouble();

        double length = Math.pow(speed, 2) / (2 * accel);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}
