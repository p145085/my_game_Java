package org.Populus.my;

public class Player {
    String firstName;
    String title;
    String profession;
    int strength;
    int dexterity;
    int intelligence;
    double health;
    double fatigue;
    double combatpower = health * fatigue;
    int attackDamageMax;
    int attackDamageMin;
    int age;
    int x;
    int y;
    int z;
    public Player(String firstName,
                  String title,
                  String profession,
                  int attackDamageMin,
                  int attackDamageMax,
                  double health,
                  int strength,
                  int dexterity,
                  int intelligence,
                  double fatigue,
                  double combatpower,
                  int age,
                  int x,
                  int y,
                  int z
    ) {
        this.firstName = firstName;
        this.title = title;
        this.profession = profession;
        this.health = health;
        this.fatigue = fatigue;
        this.combatpower = this.health * this.fatigue;
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
    public String getFirstName(){
        return firstName;
    }
//    public void setName(String newname){
//        firstName = newname;
//    }




    String[] factions = {
            "Shadow",
            "Light",
            "Fire",
            "Water",
            "Earth",
            "Electric"
    };

//    public String printAvailableFactions(String[] factions){
//        for(String faction : factions){
//            System.out.println(faction);
//        }
//    }

//    public String getBasic() {
//        return firstName + title + " is " + age + " years old and does " + profession + ".";
//    }
//
//    public String getCombatpower() {
//        return "Player has " + health + " hitpoints and is currently at " + fatigue + " fatigue, resulting in a combatpower of " + combatpower + ".";
//    }
//
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