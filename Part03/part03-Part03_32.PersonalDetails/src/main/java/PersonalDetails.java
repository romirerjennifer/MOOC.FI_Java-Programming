
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringval=  "";
        int count = 0;
        int sum=0;
        double average=0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(stringval.length()<parts[0].length()){
                stringval=parts[0];
            }
            sum+=Integer.valueOf(parts[1]);
            count+=1;
        }
        if (count>0&&!stringval.equals("")) {
            average=1.0*sum/count;
            System.out.println("Longest name: " + stringval);
            System.out.println("Average of the birth years: " + average);
        } else {
            System.out.println("No input.");
        }
                


    }
}
