
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String words=scanner.nextLine();
            if(words.equals("")){
                break;
            }
            String[]stringar=words.split(" ");
            System.out.println(stringar[stringar.length-1]);
        }


    }
}
