package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application "main-class" (class with a "main() class)
 * We'll create a few basic instances of Television and main give them a basic test drive.
 */
class TelevisionClient {

    // STARTING point for any standalone Java application
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME); // crank it up

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);  // this one is silent

        // NOW, create 3rd instance but DON'T set its properties
        Television tv3 = new Television();

        // creating 4th for DisplayType
        Television tv4 = new Television("Toshiba", 50, DisplayType.valueOf("OLED"));
        System.out.println(tv4);


        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        // show their toString() methods in action
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);    // toString automatically called.
        System.out.println();

    }
}