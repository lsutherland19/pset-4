import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature : ");
        double temp = input.nextDouble();
        System.out.print("Wind speed : ");
        double speed = input.nextDouble();
        double chill = (35.74 + 0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);

        System.out.printf("%n%-12s: %,.2f", "Wind Chill", chill);
    }
}