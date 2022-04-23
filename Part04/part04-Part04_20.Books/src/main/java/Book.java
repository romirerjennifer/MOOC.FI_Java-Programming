/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Book {
    private int Pages;
    private String Title;
    private int Year;

    public Book(int Pages, String Title, int Year) {
        this.Pages = Pages;
        this.Title = Title;
        this.Year = Year;
    }
    public String getTitle(){
        return Title;
    }
    @Override
    public String toString() {
        return Title+", "+Pages+" pages, "+Year;
    }
    
    
    
}
