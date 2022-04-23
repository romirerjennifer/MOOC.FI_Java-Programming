
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Room {
    private ArrayList<Person> elements;
    public Room(){
         this.elements=new ArrayList<>();
    }
    public void add(Person person){
        this.elements.add(person);
    }
    public boolean isEmpty(){
        return this.elements.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.elements;
    }
    public Person shortest(){
        Person shortest=null;
        if(!this.isEmpty()){
            shortest=this.elements.get(0);
            for(Person shortpart:this.elements){
                if(shortpart.getHeight()<shortest.getHeight()){
                    shortest=shortpart;
                }
            }
        }
        return shortest;
    }
    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        Person tempPerson=this.shortest();
        this.elements.remove(this.shortest());
        return tempPerson;
    }
}
