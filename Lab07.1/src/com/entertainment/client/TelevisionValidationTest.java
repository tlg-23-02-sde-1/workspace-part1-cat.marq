package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.setVolume(0);
        System.out.println(tv1);

        tv1.setVolume(100);
        System.out.println(tv1);

        tv1.setVolume(-1);
        System.out.println(tv1);

        tv1.setVolume(101);
        System.out.println(tv1);

        tv1.setBrand("Samsung");
        System.out.println("Test Brand" + tv1);

        tv1.setBrand("LG");
        System.out.println(tv1);

        tv1.setBrand("INVALID");
        System.out.println(tv1);


    }

}