
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
public class TodoList {
    private ArrayList<String> todoList;
    public TodoList() {
        todoList=new ArrayList<>();
    }
    public void add(String task){
        todoList.add(task);
        
    }
    public void print(){
        for(int index=0;index<todoList.size();index++){
            System.out.println((index+1)+": "+ todoList.get(index));
        }
    }
    public void remove(int number){
       int index = number - 1;
       if (index < 0 || index >= this.todoList.size()) {
           return;
        }
        this.todoList.remove(index);
    }
}
