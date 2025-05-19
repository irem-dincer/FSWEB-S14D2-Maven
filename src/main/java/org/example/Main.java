package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

                // Duvarlar oluşturuluyor
                Wall wall1 = new Wall("Kuzey");
                Wall wall2 = new Wall("Güney");
                Wall wall3 = new Wall("Doğu");
                Wall wall4 = new Wall("Batı");

                // Tavan oluşturuluyor
                Ceiling ceiling = new Ceiling(300, PaintColor.WHITE);

                // Yatak oluşturuluyor
        Bed bed = new Bed("style", 200, 4, 2, 5);

                // Lamba oluşturuluyor
        Lamp lamp = new Lamp(LampType.NORMAL, true, 100);

                // Gardırop oluşturuluyor
                Wardrobe wardrobe = new Wardrobe(200, 250, 70.5);

                // Halı oluşturuluyor
                Carpet carpet = new Carpet(300, 400, PaintColor.RED);

                // Yatak odası oluşturuluyor
                Bedroom bedroom = new Bedroom("Ana Yatak Odası", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

                // Yatak odasının içeriğine erişim ve metodların çağrılması
                System.out.println("Yatak Odası Adı: " + bedroom.getName());

                // Duvarlar
                System.out.println("Duvar 1 Yönü: " + bedroom.getWall1().getDirection());
                bedroom.getWall1().create();

                // Tavan
                System.out.println("Tavan Rengi: " + bedroom.getCeiling().getColor());
                bedroom.getCeiling().create();

                // Yatak
                System.out.println("Yatak Yüksekliği: " + bedroom.getBed().getHeight());
                bedroom.getBed().make();

                // Lamba
                System.out.println("Lamba Tipi: " + bedroom.getLamp().getStyle());
                bedroom.getLamp().turnOn();

                // Gardırop
                System.out.println("Gardırop Ağırlığı: " + bedroom.getWardrobe().getWeight());
                bedroom.getWardrobe().add();

                // Halı
                System.out.println("Halı Genişliği: " + bedroom.getCarpet().getWidth());
                bedroom.getCarpet().lying();
            }
        }



