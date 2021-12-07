package org.Populus.my;

public class Monster {
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
    public Monster(String firstName,
                   String gender,
                   int health,
                   int fatigue,
                   int strength,
                   int dexterity,
                   int intelligence,
                   int age,
                   int x,
                   int y,
                   int z
    ) {
        this.firstName = firstName;
        this.gender = gender;
        this.health = health;
        this.fatigue = fatigue;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.age = age;
        this.x = x;
        this.y = y;
        this.z = z;
        //Combatpower excluded from constructor.
    }
    public String monsterInfo() {
        return
                "Name:" + firstName + "\n" +
                "Gender:" + gender + "\n" +
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