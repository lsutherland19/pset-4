import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s: ","Length");
        double length = input.nextDouble();
        System.out.printf("%-10s: ","Width");
        double width = input.nextDouble();

        double area = length*width;
        double outside = (length*2) + (width*2);
        double diag = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
        System.out.printf("\n%-10s: %,.2f", "Area", area);
        System.out.printf("\n%-10s: %,.2f", "Perimeter", outside);
        System.out.printf("\n%-10s: %,.2f", "Diagonal", diag);
    }
}