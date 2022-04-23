
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDic;

    public TextUI(Scanner scanner, SimpleDictionary simpleDic) {
        this.scanner = scanner;
        this.simpleDic = simpleDic;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command=this.scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                return;
            }else if(command.equals("add")){
                System.out.println("Word: ");
                String word=this.scanner.nextLine();
                System.out.println("Translation: ");
                String translation=this.scanner.nextLine();
                this.simpleDic.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated: ");
                String toBeTranslated=this.scanner.nextLine();
                if(simpleDic.translate(toBeTranslated) == null){
                    System.out.println("Word "+toBeTranslated+ " was not found");
                }else{
                     System.out.println(" Translation: "+ simpleDic.translate(toBeTranslated));
                }
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    
}
