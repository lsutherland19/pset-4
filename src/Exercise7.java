import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Side      : ");
        double sideLength = in.nextDouble();

        double area = ((3 * Math.sqrt(3))/2) * Math.pow(sideLength, 2);
        double outside = 6 * sideLength;

        System.out.print("\n");
        System.out.printf("Area      : %,.2f\n", area);
        System.out.printf("Perimeter : %,.2f", outside);

        in.close();
    }
}
