package exercises;
/*The US Census Bureau projects population based on the following
assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five
years. Assume that the current population is 312,032,486, and one year
has 365 days. */
public class referForExercise11 {
 public static void main(String[] args){
    int population = 312032486;

    System.out.printf("The current US population is at %d \n",population);
    //calculate the amount of births a year
    //there are 86,400 seconds in a day
    int birthsInADay = (int) (86400 /7.0);
    int deathsInADay = (int) (86400/13.0);
    int immigrantsInADay = (int)(86400/45);


    int birthsInAYear = birthsInADay * 365;
    int deathsInAYear = deathsInADay * 365;
    int immigrantsInAYear = immigrantsInADay * 365;

    int year1 = population + (immigrantsInAYear + birthsInAYear) - deathsInAYear;
    int year2 = population + ((immigrantsInAYear + birthsInAYear)* 2) - (deathsInAYear * 2);
    int year3 = population + ((immigrantsInAYear + birthsInAYear)* 3) - (deathsInAYear * 3);
    int year4 = population + ((immigrantsInAYear + birthsInAYear)* 4) - (deathsInAYear * 4);
    int year5 = population + ((immigrantsInAYear + birthsInAYear)* 5) - (deathsInAYear * 5);
    
    System.out.printf(
        "In year 1, the population will grow to be %d \n"+
        "In year 2, the population will grow to be %d \n"+
        "In year 3, the population will grow to be %d \n"+
        "In year 4, the population will grow to be %d \n"+
        "In year 5, the population will grow to be %d \n",
        year1, year2, year3, year4, year5
    );

    }   
}
