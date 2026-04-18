package exercises;
/*Newton’s equation of motion for distance covered given initial
velocity, constant acceleration, and total time is described by the expression
s = ut + 1/2* ((at)^2) 

Write a program that prompts the user to enter the initial velocity u in meters/
second, time span t in seconds and acceleration a in meters/second2, and returns
the distance covered. Here is a sample run
    Enter u, t and a: 3.5 4 6.5
    The distance covered is 14.0*/
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double u, t, a;
        double distance = 0;

        //How do make the user input assign multiple variables in one statement
        System.out.print("Enter u, t, and a: ");
        u = sc.nextDouble();
        t = sc.nextDouble();
        a = sc.nextDouble();
        // System.out.println(u + " "+ t + " "+ " " + a);

        distance = (u * t) + (1/2) * (Math.pow((a * t), 2));

        //print the result
        System.out.printf("The distance covered is %.1f", distance);
    }
}
