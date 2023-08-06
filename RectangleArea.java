import java.util.Scanner;
public class RectangleArea {
    public static void main(String[]args){
        Scanner Rect = new Scanner(System.in);
        int Length = Rect.nextInt();
        int Breath = Rect.nextInt();
        int Area;
        Area = Length*Breath;
        System.out.println(Area);
    }
}
