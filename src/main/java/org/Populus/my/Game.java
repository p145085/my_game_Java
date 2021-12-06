package org.Populus.my;

public class Game {
    public static void main(String[] args) {
        World world = new World(1,2,3);
        Mobile.Player player1 = new Mobile.Player();
        Mobile.Monster monster1 = new Mobile.Monster();
        Item halberd = new Item("a halberd", "a great axe", 100, 0, 25);

        System.out.println(player1.getBasic());
        System.out.println(player1.getCombatpower());
    }
}