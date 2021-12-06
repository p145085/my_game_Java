package org.Populus.my;

public class NPC {
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