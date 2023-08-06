import java.util.Scanner;
public class Divisibleby3and5 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a%3==0 && a%5==0){
            System.out.println("Yes it is divisible by 3 and 5");
        }
    }
}
