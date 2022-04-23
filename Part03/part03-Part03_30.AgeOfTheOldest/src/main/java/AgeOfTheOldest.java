
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(oldest<Integer.valueOf(parts[1])){
                oldest=Integer.valueOf(parts[1]);
            }
            count = 1 + count;
        }

        if (count > 0) {
            System.out.println("Age of the oldest: " + oldest);
        } else {
            System.out.println("No input.");
        }


    }
}
