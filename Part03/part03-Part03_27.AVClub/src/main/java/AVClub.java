
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        while(true){
            String stringval=scanner.nextLine();
            if(stringval.equals("")){
                break;
            }
            String[]stringar=stringval.split(" ");
            for(String piece:stringar){
                if(piece.contains("av")){
                    System.out.println(piece);
                }
            }
        }
        

    }
}
