/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return identifier + ": "+name;
    }
    public boolean equals(Object compared){
         if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object to a Bird object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are, too
        if(/*this.name.equals(comparedItem.getName())&&
           */this.identifier.equals(comparedItem.getIdentifier())){
            return true;
        }
        return false;
    }
    
}
