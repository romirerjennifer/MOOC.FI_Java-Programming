
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
public class Suitcase {
    private int maxweight;
    private ArrayList<Item> items;

    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
        this.items=new ArrayList<>();
    }
    public void addItem(Item item){
        if(items!=null){
            if((item.getWeight()+this.totalWeight())>this.maxweight){
                return;
            }
        }
        this.items.add(item);
    }
    public String toString(){
        if(!items.isEmpty()){
            if(items.size()==1){
                return items.size()+"item ("+ this.totalWeight()+" kg)";
            }
           return items.size()+"items ("+ this.totalWeight()+" kg)";
        }
        return "no items (0 kg)";
    }
    public int totalWeight(){
        if(items.isEmpty()){
            return 0;
        }
        int weight=0;
        for(Item item:items){
            weight+=item.getWeight();
        }
        return weight;
    }
    public void printItems(){
        if(items==null){
            System.out.println("no items(0 kg)");return;
        }
        for(Item item:items){
           System.out.println(item);
       }
       
    }
    public Item heaviestItem(){
        Item tempItem=null;
        if(!items.isEmpty()){
            tempItem=this.items.get(0);
            for(Item itempart:items){
                if(tempItem.getWeight()<itempart.getWeight()){
                    tempItem=itempart;
                }
            }
        }
        return tempItem;
    }
}
