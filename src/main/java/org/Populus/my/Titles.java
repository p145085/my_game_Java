package org.Populus.my;

import java.util.Random;

public class Titles {

    public static String[] Titles = {
            " the Apprentice",
            " the Revered",
            " the Chosen"
    };

    public static String getRandomTitle(){
        Random rand = new Random();
        int upperbound = Titles.length;
        int int_random = rand.nextInt(upperbound);
        return Titles[int_random];
    }

}
