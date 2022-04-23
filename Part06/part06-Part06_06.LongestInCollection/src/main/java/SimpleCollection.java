
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String longest(){
        String longest=null;
        if(!this.elements.isEmpty())
        {
            longest="";
            for(String part:this.elements){
                if(part.length()>longest.length()){
                    longest=part;
                }
            }
        }
        return longest;
    }

}
