
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
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");

            String input = this.scanner.nextLine();
            if (input.equals("stop")) {
               break;
            }
            processCommand(input);
             
        }
    }
    private void processCommand(String command){
                if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        } else {
           System.out.println("Unknown command");
        }
    }
    private void add() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);

    }
    private void list(){
        this.todoList.print();
    }
    private void remove(){
        System.out.println("Which one is removed?");
        int number= Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(number);
    }
    
}
