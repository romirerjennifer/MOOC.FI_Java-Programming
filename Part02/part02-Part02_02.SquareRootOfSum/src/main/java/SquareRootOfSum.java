
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int value1 = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(value+value1);
        System.out.println(squareRoot);
    }
}
