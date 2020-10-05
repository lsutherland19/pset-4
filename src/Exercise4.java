import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Centimeters : ");
        int cm = in.nextInt();

        int km = cm / 100000;
        int m = (cm - (km * 100000))/100;
        int leftover = (cm - ((km * 100000) + (m * 100)));

        System.out.print("\n");
        System.out.println("Kilometers  : " + km);
        System.out.println("Meters      : " + m);
        System.out.println("Centimeters : " + leftover);

        in.close();
    }
}