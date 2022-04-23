

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager,Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }
    public void start(){
        while(true){
            System.out.print("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop ");
            String input = scanner.nextLine();
            if(input.equals("X")) {
                break;
            }else if(input.equals("1")){
                System.out.println("Write the Joke to be added: ");
                this.manager.addJoke(scanner.nextLine());
            }else if(input.equals("2")){
                System.out.println(this.manager.drawJoke());
            }else if(input.equals("3")){
                System.out.println("Printing the jokes. ");
                this.manager.printJokes();
            }else{
                System.out.println("unknown command");
            }
            

        }
    }
    
}
