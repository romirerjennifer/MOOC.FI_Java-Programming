
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int count=0;
        double sum=0;
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());
            if(value>0){
                sum=sum+value;
                count = count+1;
            }else if(value==0){
                if(sum==0){
                    System.out.println("Cannot calculate the average"); 
                }
                break;  
            }else if(value<0){
                System.out.println("Cannot calculate the average"); 
            }else{
                continue;
            }
        }
        System.out.println((sum/count));
    }
}
