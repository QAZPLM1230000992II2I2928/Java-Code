import java.util.Scanner;
public class Max {
    public static void main(String[]args){
        Scanner AA = new Scanner(System.in);
        System.out.println("Please enter the numbers :");
        int S = AA.nextInt();
        int D = AA.nextInt();
        if (S>D){
            System.out.println("The maximum number is : "+S);
        }
        else{
            System.out.println("The maximum number is : "+D);
        }
    }
}
