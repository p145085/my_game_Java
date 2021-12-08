package org.Populus.my;

public class Player {
    String firstName;
    String title;
    String profession;
    String gender;

    // // Default values.
    int strength;
    int dexterity;
    int intelligence;
    double health;
    double fatigue;
    double combatpower = health * fatigue; //
    int attackDamageMax;
    int attackDamageMin;
    int age;
    int x;
    int y;
    int z;
    public Player(
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
          //Combatpower excluded from constructor.
    ) {
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
        //Combatpower excluded from constructor.
    }
    public String getFirstName(){
        return firstName;
    }
//    public void setName(String newname){
//        firstName = newname;
//    }




//    String[] factions = {
//            "Shadow",
//            "Light",
//            "Fire",
//            "Water",
//            "Earth",
//            "Electric"
//    };

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
        return "Name:" + firstName + title + "\n" +
                "Profession:" + profession + "\n" +
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