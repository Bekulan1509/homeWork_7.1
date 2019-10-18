package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("white");
        car.setYear(2009);
        car.setMove(20);
        printinfo(car);



        Bus bus = new Bus();
        bus.setColor("Pink");
        bus.setMove(30);
        bus.setYear(2011);
        printinfo(bus);




        Transport [] objects = {new Car(), new Bus()};
        for (int i = 0; i <objects.length ; i++) {
            objects[i].planChecking();
            objects[i].voiceEngine();


        }




    }




    public static void printinfo (Transport a){

        System.out.println(a.getColor()+" "+a.getYear()+" "+a.getMove()+" km ");
    }
}
