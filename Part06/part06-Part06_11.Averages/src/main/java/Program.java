
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //GradeRegister register = new GradeRegister();
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(88);
        register.addGradeBasedOnPoints(61);
        register.addGradeBasedOnPoints(59);
        register.addGradeBasedOnPoints(13);
        register.addGradeBasedOnPoints(14);

        System.out.println(register.averageOfGrades());
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
        
      
        
    }
}
