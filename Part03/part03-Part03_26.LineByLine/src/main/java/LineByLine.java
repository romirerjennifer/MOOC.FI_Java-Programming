
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value=scanner.nextLine();
        while(!value.equals("")){
            String[] stringa=value.split(" ");
            for(String val:stringa){
                System.out.println(val);
            }
            value=scanner.nextLine();
        }
        
    }
}
