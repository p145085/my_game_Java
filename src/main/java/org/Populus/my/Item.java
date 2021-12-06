package org.Populus.my;

public class Item {
    String item_name;
    String item_description;
    int durability;
    int armor;
    int damageBonus;

    public Item(
            String item_name,
            String item_description,
            int durability,
            int armor_value,
            int damage_value
    ) {
        this.item_name = item_name;
        this.item_description = item_description;
        this.durability = durability;
        this.armor = armor_value;
        this.damageBonus = damage_value;
    }
}
