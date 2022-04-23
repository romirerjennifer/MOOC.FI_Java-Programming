
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
    public String toString(){
        StringBuilder elementString= new StringBuilder("");
        if(this.elements.isEmpty()){
            elementString.append("The collection "+this.name+ " is empty.");
            return elementString.toString();
        }else if(this.elements.size()==1){
            elementString.append("The collection "+this.name+ " has "+ this.elements.size()+" element:");
        }else{
           elementString.append("The collection "+this.name+ " has "+ this.elements.size()+" elements:");
        }
        for(String partelement:this.elements){
                elementString.append("\n"+partelement);
        }
        return elementString.toString();
    }
}
