
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        final String file = scanner.nextLine();

        final List<Recipe> recipes = readRecipesFromFile(file);
        System.out.println("Commands");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
         while (true) {
            System.out.println("Enter command: ");
            final String input = scanner.nextLine();

            if ("list".equalsIgnoreCase(input)) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if ("stop".equalsIgnoreCase(input)) {
                break;
            }
            if ("find name".equalsIgnoreCase(input)) {
                System.out.println("Searched word: ");
                final String query = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }
            if ("find cooking time".equalsIgnoreCase(input)) {
                System.out.println("Max cooking time: ");
                final int querytime = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.getTime()<=querytime) {
                        System.out.println(recipe);
                    }
                }
            }
            if ("find ingredient".equalsIgnoreCase(input)) {
                System.out.println("ingredient: ");
                final String query = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }
         }

    }
    public static List<Recipe> readRecipesFromFile(String file){
        final List<Recipe> recipes = new ArrayList<>();
        final List<String> recipeParts = new ArrayList<>();
        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                final String line = sc.nextLine();
                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    assignRecipeParts(recipes, recipeParts);
                }
            }
            if (!recipeParts.isEmpty()) {
                assignRecipeParts(recipes, recipeParts);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return recipes;

    }

    private static void assignRecipeParts(List<Recipe> recipes, List<String> recipeParts) {
        String recipeName;
        int cookTime;
        recipeName = recipeParts.get(0);
        cookTime = Integer.parseInt(recipeParts.get(1));
        recipeParts.remove(0);
        recipeParts.remove(0);
        recipes.add(new Recipe(recipeName, cookTime, new ArrayList<>(recipeParts)));
        recipeParts.clear();
    }


}
