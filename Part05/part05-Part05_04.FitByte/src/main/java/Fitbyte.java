/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Fitbyte {
    private int age;
    private int heartrate;

    public Fitbyte(int age, int heartrate) {
        this.age = age;
        this.heartrate = heartrate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate=206.3 - (0.711 * age);
        return (maxHeartRate - heartrate)*percentageOfMaximum+heartrate;
    }
    
    
    
}
