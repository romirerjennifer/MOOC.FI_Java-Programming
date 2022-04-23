
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        final List<Bird> birds=new ArrayList<>();
        
        System.out.println("Commands");
        System.out.println("Add - adds the bird to the observation list");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        
         while (true) {
            System.out.print("? ");
            final String input = scan.nextLine();

            if ("Quit".equalsIgnoreCase(input)) {
                break;
            }
            if ("All".equalsIgnoreCase(input)) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }
            if ("One".equalsIgnoreCase(input)) {
                System.out.print("Bird? ");
                final String query = scan.nextLine();
                for (Bird bird : birds) {
                    
                    if (bird.getName().contains(query)) {
                        System.out.println(bird);
                    }else{
                        System.out.println("Not a bird!");
                    }
                }
            }
            if ("Observation".equalsIgnoreCase(input)){
                System.out.print("Bird? ");
                final String query = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().contains(query)) {
                        bird.observed();
                    }else{
                        System.out.println("Not a bird!");
                    }
                }
            }
            if ("Add".equalsIgnoreCase(input)){
                System.out.print("Name: ");
                final String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                final String latin = scan.nextLine();
                Bird bird=new Bird(name, latin);
                birds.add(bird);
            }

         }
            

    }

}
