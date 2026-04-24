package exercises;
/*(Geometry: distance of two points) 
Write a program that prompts the user to enter two points
(x1, y1) and (x2, y2) and displays their distance. The
formula for computing the distance: 
sqrt((x2 - x1)^2 + (y2 - y1)^2)
We can use Math.pow(a, 0.5) to represent a sqrt */

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Enter the x1 and y1
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        

        //Enter x2 and y2
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
 
        /*Compute the distance. To represent sqrt 
        we use Math.pow(val, 0.5) */
        double distance = Math.pow((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)), 0.5);
        System.out.print("The distance between the two points is " + distance);
    }    
}
