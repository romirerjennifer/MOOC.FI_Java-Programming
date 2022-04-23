
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scannerf = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (scannerf.hasNextLine()) {
                lines.add(scannerf.nextLine());
            }
            if(lines.contains(searchedFor)){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " +file+" failed.");
        }

    }
}
