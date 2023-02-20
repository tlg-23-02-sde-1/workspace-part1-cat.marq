package net.tamagotchi.client;

import net.tamagotchi.CatPersonalityType;
import net.tamagotchi.Tamagotchi;

public class TamagotchiClient {

    public static void main(String[] args) {
        Tamagotchi c1 = new Tamagotchi();
        c1.setBreed("Munchkin");
        c1.setHealth(100);
        c1.setAge(1);

        Tamagotchi c2 = new Tamagotchi("RagDoll", 99, 4);

        Tamagotchi c3 = new Tamagotchi("BlueRussian");
        System.out.println(c3);

        Tamagotchi c4 = new Tamagotchi("Munchkin", 98, 2, CatPersonalityType.HAPPY);
        System.out.println(c4);

        c1.play();
        c2.nap();
        c3.feed();
    }
}