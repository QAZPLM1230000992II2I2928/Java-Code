import java.util.Scanner;
public class Tables {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int Number = num.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(Number*i);
            i++;
        }
    }
}
