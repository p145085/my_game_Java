package org.Populus.my;

public class Mobile {
    public static class Player {
        String firstName;
        String title;
        String profession;
        double health;
        double fatigue;
        double combatpower;
        double strength;
        double dexterity;
        double intelligence;
        int attackDamageMax;
        int attackDamageMin;
        int age;
        int x;
        int y;
        int z;

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

}
