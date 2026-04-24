package exercises;
/*(Geometry: area of a hexagon)
Write a program that prompts the user to enter the side of
a hexagon and displays its area. The formula for computing
the area of a hexagon is:
area = (3 sqrt(3))/2 * s^2 */

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the length of the side: ");
        double length = sc.nextDouble();

        double scale = Math.pow(10,4);  //uthe exponent is the decimal point

        /*To round a value to a specific decimal, we will use 
        Math.round(val * scale)  / scale*/
        double area = (3 * Math.pow(3,0.5))/2 *(Math.pow(length, 2));
        double roundedArea = Math.round(area * scale) / scale;
        System.out.println("The area of the hexagon is " + roundedArea);
    }    
}
