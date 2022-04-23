/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Container {    
    private int liquidamount ;
    public Container(){
        this.liquidamount=0;
    }
    public void add(int amount){
        if(amount<0){
            return;
        }
        this.liquidamount+=amount;
        if(this.liquidamount>100){
            this.liquidamount=100;
        }
    }
   
    public void remove(int amount){
        if(amount<0){
            return;
        }
        if(amount>this.liquidamount){
            this.liquidamount=0;
        }else{
            this.liquidamount-=amount;
        }
    }
    public int contains(){
        return this.liquidamount;
    }
    public String toString(){
        return this.liquidamount +"/100";
    }
    
}
