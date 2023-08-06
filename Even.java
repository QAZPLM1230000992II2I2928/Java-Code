import java.util.Scanner;
public class Even {
    public static void main(String[]args){
        Scanner In = new Scanner(System.in);
        int  a = In.nextInt();
        if (a%2==0){
            System.out.println("It's an even number.");
        }
        else {
            System.out.println("It's an ODD number .");
        }
    }
}
