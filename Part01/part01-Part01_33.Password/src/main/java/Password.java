
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        String stringvalue = scan.nextLine();
       
        if(stringvalue.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
