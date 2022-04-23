
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        start = Integer.valueOf(scanner.nextLine());
        if(end>=start){
            for (int i=start; i<=end;i++){
                System.out.println(i);
            }
        }
        

        // Write your program here
    }
}
