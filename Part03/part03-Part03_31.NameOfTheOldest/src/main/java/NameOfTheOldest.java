
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringar=  new String [] {"Name", "0"};
        int age = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(Integer.valueOf(stringar[1])<Integer.valueOf(parts[1])){
                stringar[1]=parts[1];
                stringar[0]=parts[0];
            }
        }

        if (!stringar[0].equals("Name")) {
            System.out.println("Name of the oldest: " + stringar[0]);
        } else {
            System.out.println("No input.");
        }

    }
}
