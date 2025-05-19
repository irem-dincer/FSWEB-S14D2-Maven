package org.example.model;
public class Bed {

    private int pillows;
    private int height;
    private int sheets;
    private int quilts;
    private String style;

    public Bed(String style, int pillows, int height, int sheets, int quilts){
        this.pillows=pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilts=quilts;
        this.style=style;
    }



public void make(){
    System.out.println("The bed is being made.");
}

public int getPillows(){
        return this.pillows;
}
    public int getHeight() {
        return this.height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getQuilts(){
        return this.quilts;
    }

    public String getStyle() {
        return style;
    }

}
