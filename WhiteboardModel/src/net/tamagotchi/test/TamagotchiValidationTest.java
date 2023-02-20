package net.tamagotchi.test;

import net.tamagotchi.Tamagotchi;

class TamagotchiValidationTest {
    public static void main(String[] args) {
        Tamagotchi c1 = new Tamagotchi();
        c1.setHealth(-1);
        c1.setAge(0);
        System.out.println(c1);

        c1.setHealth(1);
        c1.setAge(2);
        System.out.println(c1);

        c1.setHealth(100);
        c1.setAge(25);
        System.out.println(c1);

        c1.setHealth(101);
        c1.setAge(26);
        System.out.println(c1);
    }
}