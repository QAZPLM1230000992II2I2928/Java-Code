import java.util.Scanner;
public class TonNaturalNumber {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int Number = num.nextInt();
        int i = 1;
        while(i<=Number){
            System.out.println(i);
            i++;
        }
    }
}
