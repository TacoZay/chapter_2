package exercises;
/*(Geometry: area of a triangle)
Write a program that prompts the user to enter three points,
(x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
its area. The formula for computing the area of a triangle is

s = (side1 + side2 + side3)/2
area = sqrt(s(s - side1)(s - side2)(s - side3))
*/

//Import the Java scanner to take in user input
import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args){

        //created the scanner object
        Scanner sc = new Scanner(System.in);

        //Use enters the coords for the triangle
        double x1, x2, x3, y1, y2, y3;
        System.out.print("Enter the coordinates of three points \n"+
            "separated by spaces like x1 y1 x2 y2 x3 y3: ");
        
        x1 = sc.nextDouble(); y1 = sc.nextDouble();
        x2 = sc.nextDouble(); y2 = sc.nextDouble();
        x3 = sc.nextDouble(); y3 = sc.nextDouble();

        //These are the necessary calculations to find the side of a triangle
        //formula: side = sqrt((x_2 - x_1)^2 + (y_2 - y_1)^2) where side is length
        //copied and pasted it 3 times to get all the sides for the trianlge
        double side1 = Math.pow(
            (Math.pow((x2 - x1),2) +Math.pow((y2 - y1),2) ),0.5);       //side AB
        System.out.println(side1);

        double side2 = Math.pow(
            (Math.pow((x3 - x2),2) +Math.pow((y3 - y2),2) ),0.5);       //side AB
        System.out.println(side2);
        
        double side3 = Math.pow(
            (Math.pow((x3 - x1),2) +Math.pow((y3 - y1),2) ),0.5);       //side AB
        System.out.println(side2);

        //Use the given calculations to calculate the area
        double s = (side1 + side2 + side3)/2;
        double area = Math.round(Math.pow((s *(s - side1) *(s - side2) * (s - side3)),0.5) * 10.0) /10.0;
        System.out.println("The area of the triangle is "+ area);
    }    
}
