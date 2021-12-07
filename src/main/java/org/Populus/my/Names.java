package org.Populus.my;
import java.util.Random;

public class Names {
    public static String[] MaleNames = {"John", "Carl", "Simon"};
    public static String[] FemaleNames = {"Sarah", "Lisa", "Emma"};

    public static String getRandomMaleName(){
        Random rand = new Random();
        int upperbound = MaleNames.length;
        int int_random = rand.nextInt(upperbound);
        return MaleNames[int_random];
    }
    public static String getRandomFemaleName(){
        Random rand = new Random();
        int upperbound = FemaleNames.length;
        int int_random = rand.nextInt(upperbound);
        return FemaleNames[int_random];
    }

}
