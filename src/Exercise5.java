import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s: ","Diameter");
        double diameter = input.nextDouble();

        double area = (Math.PI)*Math.pow(diameter/2,2);
        double circ = Math.PI*diameter;
        System.out.printf("\n%-15s: %,.2f", "Area", area);
        System.out.printf("\n%-15s: %,.2f", "Circumference", circ);
    }
}