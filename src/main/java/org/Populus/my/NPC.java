package org.Populus.my;

public class NPC {
    String firstName;
    String title;
    String profession;
    String gender;
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
    NPC (
            String firstName,
            String title,
            String profession,
            String gender,
            int attackDamageMin,
            int attackDamageMax,
            double health,
            int strength,
            int dexterity,
            int intelligence,
            double fatigue,
            int age,
            int x,
            int y,
            int z
    ){
        this.firstName = firstName;
        this.title = title;
        this.profession = profession;
        this.gender = gender;
        this.health = health;
        this.fatigue = fatigue;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.attackDamageMax = attackDamageMax;
        this.attackDamageMin = attackDamageMin;
        this.age = age;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String NPCInfo() {
        return
                "Name:" + firstName + "\n" +
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