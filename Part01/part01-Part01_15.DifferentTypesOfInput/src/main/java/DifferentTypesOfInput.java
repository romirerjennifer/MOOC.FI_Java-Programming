
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String stringvalue = scan.nextLine();
        System.out.println("Give an integer:");
        int intvalue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doublevalue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolvalue = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + stringvalue);
        System.out.println("You gave the integer " + intvalue);
        System.out.println("You gave the double " + doublevalue);
        System.out.println("You gave the boolean " + boolvalue);
    }
}
