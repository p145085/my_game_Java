package org.Populus.my;

import java.util.Random;

public class Professions {
    public static String[] professions = {
            "Blacksmith",
            "Tailor",
            "Tanner",
            "Bard"
    };
    public static String getRandomProfession(){
        Random rand = new Random();
        int upperbound = professions.length;
        int int_random = rand.nextInt(upperbound);
        return professions[int_random];
    }
}
