
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());


        Hideout<Integer> den1 = new Hideout<>();
        System.out.println(den1.isInHideout());
        den1.putIntoHideout(1);
        System.out.println(den1.isInHideout());
        System.out.println(den1.isInHideout());
        System.out.println(den1.takeFromHideout());
        System.out.println(den1.isInHideout());

    }
}
