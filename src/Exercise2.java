import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Inches  : ");
        double inches = key.nextDouble();
        key.close();

        int inch = (int) inches;

        int mi = inch / 63360;
        int firstFt = inch - (mi * 63360);

        int feet = firstFt / 12;
        int inchesRemainder = firstFt - (feet * 12);

        System.out.print("\nMiles  : " + mi + "\nFeet   : " + feet + "\nInches : " + inchesRemainder + "\n");
    }
}