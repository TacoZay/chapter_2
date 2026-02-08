/*(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone. Here is
a sample run: */

//importing scanner
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        //Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        //Obtain the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the toal minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour 
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours 
        long totalHours = totalMinutes / 60;

        //Compute the current hour 
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" +
            currentMinute + ":" + currentSecond + " GMT");


        //------------------- Beginning of the exercise ------------------------------------------------- //

        //Ask the user to enter the timezone offset:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the timezone offset to GMT: ");
        String offset = sc.nextLine();

        

        
        String[] offsetStringArray = new String[0];
        int offsetNumber = 0;

        //check the users input if its negative
        if(offset.contains("-")){
            //split the offset variable 
            //Grab everything after the negative sign if its entered as well
            offsetStringArray = offset.split("-");
            offsetNumber =  Integer.parseInt(offsetStringArray[1]);
            System.out.println("Current time is " + (currentHour - offsetNumber) + ":" +
            currentMinute + ":" + currentSecond + " GMT");

            //How do I apply the negative value to the time and keep it within 24 hour format

        } else {
            offsetNumber = Integer.parseInt(offset);
            //Now the we're able to grab the offset value, apply it to the GMT time
            System.out.println("Current time is " + (currentHour + offsetNumber) + ":" +
            currentMinute + ":" + currentSecond + " GMT");
        }

        System.out.println("The offset number was "+ offset);


        





        // if(offset.contains("-")){
        //     //how do I pull the second char in the string
        //     offsetNum = (int) offset.charAt(1);
    
        // } else {
        //     offsetNum = (int) offset.charAt(0);
        // }


  
    }
}
