
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstLiters=0;
        int SecondLiters=0;
        while (true) {
            System.out.println("First: "+firstLiters+"/100");
            System.out.println("Second: "+SecondLiters+"/100");
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts=input.split(" ");
            String command=parts[0];
            int amount=Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                if(amount>0){
                    firstLiters+=amount;
                    if(firstLiters>100){
                        firstLiters=100;
                    }
                }   
            }else if(command.equals("remove")){
                if(amount>0){
                   if(amount>SecondLiters){
                    SecondLiters=0;
                    }else{
                        SecondLiters-=amount;
                    }
                } 
            }else if(command.equals("move")){
                if(amount>0){
                    if(amount>firstLiters){
                    SecondLiters=firstLiters;
                    firstLiters=0;
                    }else{
                        SecondLiters+=amount;
                        firstLiters-=amount;
                    }
                    if(SecondLiters>100){
                        SecondLiters=100;
                    }
                }   
            }
        }
    }

}
