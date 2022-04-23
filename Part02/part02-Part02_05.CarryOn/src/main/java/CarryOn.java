
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringvalue;
        while(true){
            System.out.println("Shall we carry on?");
            stringvalue = scanner.nextLine();
            if(stringvalue.equals("no")){
                break;
            }
        }
    }
}
