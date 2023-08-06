import java.util.Scanner;
public class Reverse_a_Number {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        String Number = num.nextLine();
        String number = "";
        for (int i =Number.length();i>0;i--){
            number = number +Number.charAt(i);
        }
        System.out.println(number);
    }
}
