/*To accept the number of days and 
 * display the result after converting it into 
 * number of years, number of months 
 * and the remaining number of days.
 */
import java.util.*;
public class TimeConverter
{
    public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int d,yr,mon,rem,hr,min,sec;
         System.out.println("WELCOME TO TIME CONVERTER");
         System.out.println("Enter the number of day/days:-");
         d=sc.nextInt();
         yr=d/365;
         mon=(d%365)/30;
         rem=(d%365)%30;
         hr=24*d;
         min=hr*60;
         sec=min*60;
         System.out.println("In "+d+" days,");
         System.out.println("Number of years = "+yr+" years.");
         System.out.println("Number of months = "+mon+" months.");
         System.out.println("Remaining number of days = "+rem+" days.");
         System.out.println("Number of hours = "+hr+" hours.");
         System.out.println("Number of minutes = "+min+" minutes.");
         System.out.println("Number of seconds = "+sec+" seconds.");
     }
}