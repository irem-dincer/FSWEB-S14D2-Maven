package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private int globRating;
    private  boolean battery;
    private LampType style;



    public Lamp(LampType lampStyle, boolean battery, int globRating) {
        this.style = lampStyle;
        this.battery = battery;
        this.globRating = globRating;
    }


public void turnOn(){
    System.out.println("Lamp is being turned on");

}
public LampType getStyle(){
    return this.style;
}
public  boolean isBattery(){
    return  this.battery;
}
public int getGlobRating(){
    return this.globRating;
}
}
