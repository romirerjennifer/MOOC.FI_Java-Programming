
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int value1 = Integer.valueOf(scanner.nextLine());
        if(value<value1){
            System.out.println(value+" is smaller than " + value1);
        }else if (value> value1){
            System.out.println(value+" is greater than " + value1); 
        }else{
            System.out.println(value+ " is equal to "+ value1);
        }
       

    }
}
