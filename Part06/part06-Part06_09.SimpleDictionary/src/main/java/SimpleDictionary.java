
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        if(this.translations.containsKey(word)){
            return this.translations.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
