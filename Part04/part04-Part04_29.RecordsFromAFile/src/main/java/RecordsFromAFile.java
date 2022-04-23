
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fname=scanner.nextLine();
        try (Scanner scannerf = new Scanner(Paths.get(fname))) {

            while (scannerf.hasNextLine()) {
                String line = scannerf.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if(age==1){
                   System.out.println(name+ ", age: " + age+ " year");
                }else{
                   System.out.println(name+ ", age: " + age+ " years"); 
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
