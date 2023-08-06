import java.util.Scanner;
public class One_To_N_Number_By_Do_While_Loop {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int Number = num.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=Number);
    }
}
