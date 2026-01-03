public class ComputeArea {
    public static void main(String[] args) throws Exception {
        double radius;
        double area;

        //Assign a radius
        radius = 20;    //radius is now 20


        //Step 1: read in radius

        //Step 2: Compute Area
        area = radius * radius * 3.14159;
        //Step 3: Display the area
        System.out.println("The area for the circle of radius " + 
            radius + " is " + area);
    }
}
