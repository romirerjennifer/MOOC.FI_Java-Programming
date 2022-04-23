
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holding;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holding = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.holding!=null){
            if((this.totalWeight()+suitcase.totalWeight())>maxWeight){
                return;
            }
        }
        this.holding.add(suitcase);
    }
    public String toString(){
        if(!holding.isEmpty()){
            if(holding.size()==1){
                return holding.size()+"suitcase ("+ this.totalWeight()+" kg)";
            }
           return holding.size()+"suitcases ("+ this.totalWeight()+" kg)";
        }
        return "no suitcases (0 kg)";}
    public int totalWeight(){
        if(holding.isEmpty()){
            return 0;
        }
        int weight=0;
        for(Suitcase suitcase:holding){
            weight+=suitcase.totalWeight();
        }
        return weight;
    }
    public void printItems(){
        if(holding==null){
            return;
        }
        for(Suitcase suitcase:holding){
           suitcase.printItems();
       }
        
    }
}
