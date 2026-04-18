package exercises;
/* (Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following formulas:
area = sqrt(3)/4 * (length of sides)^Z
volume = area * length */
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //prompts the user to enter the length
        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        double length = sc.nextDouble();

        //not sure if z needs to be changed based on the length provided. Checking my notes for calculation
        

        //(Issue: want to round the variable result to the hundreth place)
        double result = Math.sqrt(3)/4 * Math.pow(length, 2);
        double resultRounded = (int)(result * 100 + 0.5) / 100.0;

        //calculate the volume 
        double volume = resultRounded * length;
        

        System.out.println("The area is "+resultRounded);
        System.out.println("The volume of the Triangular prism is " +volume);

    }
}
