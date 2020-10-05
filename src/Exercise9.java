import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Name   : ");
        String firstName = input.nextLine();
        System.out.print("Middle Name  : ");
        String middleName = input.nextLine();
        System.out.print("Last Name    : ");
        String lastName = input.nextLine();

        String firstInitial = firstName.substring(0, 1);
        String middleInitial = middleName.substring(0, 1);
        String lastInitial = lastName.substring(0, 1);

        String monogram = (firstInitial + middleInitial + lastInitial).toUpperCase();

        input.close();

        System.out.print("\n");
        System.out.print(monogram + ".");

    }
}