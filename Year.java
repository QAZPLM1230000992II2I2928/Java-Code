import java.util.Scanner;
public class Year {
    public static void main(String[]args){
        Scanner Year = new Scanner(System.in);
        int LeapYear = Year.nextInt();
        if(LeapYear%4==0 || (LeapYear%100==0 && LeapYear%400==0)){
            System.out.println("It's a leap year.");
        }
        else {
            System.out.println("It's not a leap year .");
        }
    }
}
