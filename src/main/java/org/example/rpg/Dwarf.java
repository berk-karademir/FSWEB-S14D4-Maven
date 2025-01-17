package org.example.rpg;

public class Dwarf extends Monster{


    public Dwarf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage();
    }

    @Override
    public boolean hasBleedingDmg() {
        return false;
    }

    @Override
    public boolean hasPoisonDmg() {
        return false;
    }
}
