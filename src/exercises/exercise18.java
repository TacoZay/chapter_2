package exercises;


/*(Print a table)
Write a program that displays the following table. Calculate
the middle point of two points */
public class exercise18 {
    public static void main(String[] args){
        System.out.println(" a         b       Middle");
        System.out.print("(0,0)   (2,1)     ");
        int a1, a2, b1, b2;
        double m1, m2;
        a1 = 0; a2 = 0;
        b1 = 2; b2 = 1;
        m1 = (double) (a1 + b1)/2;
        m2 = (double) (a2 + b2)/2;
        System.out.print("("+m1+","+m2+")\n");

        System.out.print("(1,4)   (4,2)     ");
        a1 = 1; a2 = 4;
        b1 = 4; b2 = 2;
        m1 = (double) (a1 + b1)/2;
        m2 = (double) (a2 + b2)/2;
        System.out.print("("+m1+","+m2+")\n");

        System.out.print("(2,7)   (6,3)     ");
        a1 = 2; a2 = 7;
        b1 = 6; b2 = 3;
        m1 = (double) (a1 + b1)/2;
        m2 = (double) (a2 + b2)/2;
        System.out.print("("+m1+","+m2+")\n");

        System.out.print("(3,9)   (10,5)    ");
        a1 = 3; a2 = 9;
        b1 = 10; b2 = 5;
        m1 = (double) (a1 + b1)/2;
        m2 = (double) (a2 + b2)/2;
        System.out.print("("+m1+","+m2+")\n");

        System.out.print("(4,11)  (12,7)    ");
        a1 = 4; a2 = 11;
        b1 = 12; b2 = 7;
        m1 = (double) (a1 + b1)/2;
        m2 = (double) (a2 + b2)/2;
        System.out.print("("+m1+","+m2+")\n");
    }
}
