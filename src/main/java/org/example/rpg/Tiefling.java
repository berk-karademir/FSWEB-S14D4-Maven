package org.example.rpg;

public class Tiefling extends Monster implements Bleedable{


    public Tiefling(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double bleed() {
        return  getDamage() * Bleedable.super.bleed();
    }

    @Override
    public double attack() {
        return getDamage() + this.bleed();
    }

    @Override
    public boolean hasBleedingDmg() {
        return true;
    }

    @Override
    public boolean hasPoisonDmg() {
        return false;
    }
}
