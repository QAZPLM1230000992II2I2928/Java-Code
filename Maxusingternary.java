import java.util.Scanner;
public class Maxusingternary {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        String Answer = (a>b) ? "First number is greater" : "Second number is greater";
        System.out.println(Answer);
    }
}
