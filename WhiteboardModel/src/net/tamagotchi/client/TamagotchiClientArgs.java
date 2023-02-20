package net.tamagotchi.client;

import net.tamagotchi.CatPersonalityType;
import net.tamagotchi.Tamagotchi;

import java.util.Arrays;

public class TamagotchiClientArgs {
    public static void main(String[] args) {

        String[] bananaPants = new String[4];

        switch (args.length) {
            case 4:
                bananaPants[0] = "Note: Supported Personality types are:" + Arrays.toString(CatPersonalityType.values());
            case 3:
                bananaPants[1] = "Age must be between" + Tamagotchi.MIN_AGE + " and " + Tamagotchi.MAX_AGE;
            case 2:
                bananaPants[2] = "Health must be between" + Tamagotchi.MIN_HEALTH + " and " + Tamagotchi.MAX_HEALTH;
            case 1:
                bananaPants[3] = "Aww, that is a cute cat.";
            default:

                System.out.println(bananaPants[3] + bananaPants[2] + bananaPants[1] + bananaPants[0]);
        }

        int bobs = Integer.parseInt(args[1]);
        int bobi = Integer.parseInt(args[2]);
        CatPersonalityType personalityType = CatPersonalityType.valueOf(args[3]);

        Tamagotchi bob = new Tamagotchi(args[0],bobs, bobi, personalityType);


    }


}