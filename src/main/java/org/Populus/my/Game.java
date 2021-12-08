package org.Populus.my;

public class Game {
    public static void main(String[] args) {
        //World world = new World(1,2,3);
        Player player1 = new Player(
                "Populus",
                "the Grandmaster",
                "Legendary Blacksmith",
                "Male",
                1,
                5,
                100,
                5,
                5,
                5,
                1,
                29,
                2,
                2,
                2
        );
        Monster monster1 = new Monster("a Goblin",
                "Male",
                100,
                1,
                5,
                3,
                1,
                25,
                1,
                1,
                1
        );
        Item halberd = new Item(
                "a halberd",
                "a two-handed weapon, it is also used for chopping wood.",
                100,
                0,
                25
        );




        NPC npc1 = new NPC(
                Names.getRandomMaleName(),
                Titles.getRandomTitle(),
                Professions.getRandomProfession(),
                "Male",
                1,
                5,
                100,
                6,
                5,
                6,
                1,
                30,
                2,
                2,
                2
        );

        System.out.println(player1.playerInfo());
        System.out.println(monster1.monsterInfo());
        System.out.println(halberd.item_description);
        System.out.println(npc1.NPCInfo());
    }
}