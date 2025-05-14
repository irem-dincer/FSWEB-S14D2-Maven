package org.example.model;
public class Bed {

    private int pillows;
    private int height;
    private int sheets;
    private int quilts;
    private String style;

    public Bed(int pillows, int height, int sheets, int quilts,String style){
        this.pillows=pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilts=quilts;
        this.style=style;
    }
    public Bed(String pillowsString, int height, int sheets, int quilts, int styleInt) { ///
        // String pillows parametresini görmezden gelip, sabit bir değer atayabilirsiniz
        this.pillows = 2; // Varsayılan değer
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
        this.style = String.valueOf(styleInt); // int style'ı String'e dönüştür
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
