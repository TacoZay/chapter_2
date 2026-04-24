package exercises;
/*(Health Application: computing BMI)
Body Mass Index(BMI) is a measure of health on weight. It
can be calculated by taking your weight in kilograms and
dividing, by the square of your heightin meters. 

Write a program that prompts the user to enter a weight
in pounds and height in inches and displays the BMI. Note
one pound is 0.045359237 kilograms and one inch is 0.0254 
meters. Here is a sample run:

Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573*/

import java.util.*;

public class exercise14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in pounds: ");
        double height = sc.nextDouble();

        double weightToKilo = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double BMI = weightToKilo / Math.pow(heightInMeters, 2);
        double scale = Math.pow(10,4);          //this 
        double roundedBMI = Math.round(BMI * scale) / scale;
        System.out.println("BMI is "+roundedBMI);

    }    
}
