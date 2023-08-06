import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner qw = new Scanner(System.in);
        System.out.print("PLease enter the Radius : ");
        int q = qw.nextInt();
        int w;
        w = q*q;
        System.out.print("The area of circle is : ");
        System.out.println(3.14*w);
    }
}
