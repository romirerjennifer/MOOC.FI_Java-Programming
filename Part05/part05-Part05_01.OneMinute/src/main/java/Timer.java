/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
class Timer {
    
    ClockHand hundredths = new ClockHand(100);
    ClockHand seconds = new ClockHand(60);
    public Timer(){
        
    }
    @Override
    public String toString(){
        return seconds+":"+hundredths;
    }
    public void advance(){
        hundredths.advance();

        if (hundredths.value() == 0) {
            seconds.advance();
        }
    }
    
}
