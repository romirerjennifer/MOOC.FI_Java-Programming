import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        ArrayList<Book> collection=new ArrayList<Book>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while(true){
            System.out.println("Title: ");
            String title=scan.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages=Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year=Integer.valueOf(scan.nextLine());
            
            collection.add(new Book(pages,title,year));
        }
        System.out.println("What information will be printed?");
        String print=scan.nextLine();
        if(print.equals("everything")){
            collection.forEach(part->{
                System.out.println(part.toString());
            });
        }else if(print.equals("name")){
            collection.forEach(part->{
                System.out.println(part.getTitle());
            });
        }

    }

   
}
