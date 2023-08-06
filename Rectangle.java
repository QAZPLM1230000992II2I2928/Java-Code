import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        System.out.println("Please Enter : ");
        Scanner SIU = new Scanner(System.in);
        int p = SIU.nextInt();
        int r = SIU.nextInt();
        int t = SIU.nextInt();
        int SI;
        SI = p*r*t/100;
        System.out.println(SI);
    }
}
