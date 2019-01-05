import java.time.LocalDate;
import java.util.*;

public class DateClass {

    private int Day;
    private int Month;
    private int Year;

 DateClass(){
            Day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            Month = (Calendar.getInstance().get(Calendar.MONTH)+1);
            Year = Calendar.getInstance().get(Calendar.YEAR);
        } 

 public static void CurrentDate() {
         System.out.printf("Today's date is " + (Calendar.getInstance().get(Calendar.MONTH)+1) + "/" 
         + Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" + Calendar.getInstance().get(Calendar.YEAR) + "\n");
        }
 
 public int getDay(){
     return Day;
 }

 public int getMonth(){
     return Month;
 }

 public int getYear() {
     return Year;
 }

 public void setDay(int d) {
    
     Scanner input = new Scanner(System.in);
     if (Month == 2 && (LeapYear() == true)){
        while (d <= 0 || d >= 30){
            System.out.printf("Sorry this day is not possible in Febraury on a leap year, please enter a day again: ");
            d = input.nextInt();
        }
     }
     else if ((Month == 2) && (LeapYear() == false)) {
         while (d <= 0 || d >= 29){
            System.out.printf("Sorry this day is not possible in Febraury, please enter a day again: ");
            d = input.nextInt();
         }
     }
     else if (Month % 2 == 1){
        while (d <= 0 || d >= 32){
            System.out.printf("Sorry this day is not possible in this month, please enter a day between 1 and 31: ");
            d = input.nextInt();
        }
     }
     else if (Month % 2 == 0){
        while (d <= 0 || d >= 31){
            System.out.printf("Sorry this day is not possible in this month, please enter a day between 1 and 30: ");
            d = input.nextInt();
        }
     } 
     Day = d;
 }

 public void setMonth(int m) {
    Scanner input = new Scanner(System.in);
     if (m <= 0 || m >= 13){
         System.out.printf("Sorry this month is not a real month, please enter a number between 1 and 12: ");
         m = input.nextInt();
     }
      Month = m;
 }

 ///negative years will be considered BC years
 public void setYear (int y ) {
     Year = y;
     }
 


 public boolean LeapYear(){
     if ((Year % 4 == 0) && ((Year % 100 != 0) || (Year % 400 == 0)))
        return true;
     else 
        return false;
 }


 public void newDay(){
    System.out.printf("Enter a number to create a new date in the future:\n");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    while (n < 0) {
        System.out.printf("No negative numbers please. Enter another number: ");
        n = input.nextInt();
    }

    int d = Day + n;
    int m = Month;
    int y = Year;
    while (d > 30){
    if (m == 1 &&  d > 31){
        d = d - 31;
        m = 2;
    }
    if (m == 2 && LeapYear() == true && d > 29){
        d = d - 29;
        m = 3;
    }
    if (m == 2 && LeapYear() == false && d > 28){
        d = d - 28;
        m = 3;
    }
    if ((m % 2 == 0) && (m != 12) && (m != 2) && d > 30){
        d = d - 30;
        m++; 
    }
    if ((m % 2 == 1) && (m != 1) && d > 31){
        d = d - 31;
        m++;
    }
    if (m == 12 && d > 30){
        d = d - 30;
        m = 1;
        y++;
    }} //do while the if statements still can have true parameter statements

   System.out.printf("After %d days, the new date is: %d/%d/%d\n", n, m, d, y);
 }

}
