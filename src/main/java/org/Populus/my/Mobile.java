package org.Populus.my;

public class Mobile {
    public static class Player {
        String firstName;
        String title;
        String profession;
        double health;
        double fatigue;
        double combatpower = health * fatigue;
        double strength;
        double dexterity;
        double intelligence;
        int attackDamageMax;
        int attackDamageMin;
        int age;
        int x;
        int y;
        int z;
        String[] factions = {
                "Shadow",
                "Light",
                "Fire",
                "Water",
                "Earth",
                "Electric"
        };

        public String printAvailableFactions(String[] factions){
            for(String faction : factions){
                System.out.println(faction);
            }
        }

//        public static void create_Populus(){
//            player1.firstName = "Populus";
//            player1.title = " the Grandmaster";
//            player1.profession = "Legendary Blacksmith";
//            player1.attackDamageMin = 1;
//            player1.attackDamageMax = 5;
//            player1.health = 100;
//            player1.strength = 5;
//            player1.dexterity = 5;
//            player1.fatigue = (player1.dexterity + 1.25);
//            player1.combatpower = player1.health * player1.fatigue;
//            player1.intelligence = 5;
//            player1.age = 29;
//            player1.x = 2;
//            player1.y = 2;
//            player1.z = 2;
//        }

        public String getBasic() {
            return firstName + title + " is " + age + " years old and does " + profession + ".";
        }

        public String getCombatpower() {
            return "Player has " + health + " hitpoints and is currently at " + fatigue + " fatigue, resulting in a combatpower of " + combatpower + ".";
        }

        public String playerInfo() {
            return "Name:" + firstName + "\n" +
                    "Title:" + title + "\n" +
                    "Profession:" + profession + "\n" +
                    "Age:" + age + "\n" +
                    "Health:" + health + "\n" +
                    "Fatigue:" + fatigue + "\n" +
                    "Combatpower:" + combatpower + "\n" +
                    "Strength:" + strength + "\n" +
                    "Dexterity:" + dexterity + "\n" +
                    "Intelligence:" + intelligence + "\n" +
                    "AttackDamageMin:" + attackDamageMin + "\n" +
                    "AttackDamageMax:" + attackDamageMax + "\n" +
                    "Location X:" + x + "\n" +
                    "Location Y:" + y + "\n" +
                    "Location Z:" + z + "\n"
                    ;
        }
    }
    public static class Monster {
        String name;
        String title;
        String profession;
        double health;
        double fatigue;
        double combatpower = health * fatigue;
        double strength;
        double dexterity;
        double intelligence;
        int attackDamageMax;
        int attackDamageMin;
        int age;
        int x;
        int y;
        int z;
        public String monsterInfo() {
            return
                    "Name:" + name + "\n" +
                            "Title:" + title + "\n" +
                            "Profession:" + profession + "\n" +
                            "Age:" + age + "\n" +
                            "Health:" + health + "\n" +
                            "Fatigue:" + fatigue + "\n" +
                            "Combatpower:" + combatpower + "\n" +
                            "Strength:" + strength + "\n" +
                            "Dexterity:" + dexterity + "\n" +
                            "Intelligence:" + intelligence + "\n" +
                            "AttackDamageMin:" + attackDamageMin + "\n" +
                            "AttackDamageMax:" + attackDamageMax + "\n" +
                            "Location X: " + x + "\n" +
                            "Location Y: " + y + "\n" +
                            "Location Z: " + z + "\n"
                    ;
        }
    }
    public static class NPC {
        String name;
        String title;
        String profession;
        double health;
        double fatigue;
        double combatpower = health * fatigue;
        double strength;
        double dexterity;
        double intelligence;
        int attackDamageMax;
        int attackDamageMin;
        int age;
        int x;
        int y;
        int z;
        public String NPCInfo() {
            return
                    "Name:" + name + "\n" +
                            "Title:" + title + "\n" +
                            "Profession:" + profession + "\n" +
                            "Age:" + age + "\n" +
                            "Health:" + health + "\n" +
                            "Fatigue:" + fatigue + "\n" +
                            "Combatpower:" + combatpower + "\n" +
                            "Strength:" + strength + "\n" +
                            "Dexterity:" + dexterity + "\n" +
                            "Intelligence:" + intelligence + "\n" +
                            "AttackDamageMin:" + attackDamageMin + "\n" +
                            "AttackDamageMax:" + attackDamageMax + "\n" +
                            "Location X: " + x + "\n" +
                            "Location Y: " + y + "\n" +
                            "Location Z: " + z + "\n"
                    ;
        }
    }
}
