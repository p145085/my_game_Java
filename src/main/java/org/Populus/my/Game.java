package org.Populus.my;

public class Game {
    public static void main(String[] args) {
        World world = new World(1,2,3);
        Mobile.Player player1 = new Mobile.Player();
        Mobile.Monster monster1 = new Mobile.Monster();

        System.out.println(player1.playerInfo());
        System.out.println(player1.getBasic());
        System.out.println(player1.getCombatpower());
    }
}