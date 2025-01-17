package org.example.rpg;

public class Elf extends Monster implements Poisonable{


    public Elf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double poison() {
        return  getDamage() * Poisonable.super.poison();
    }

    @Override
    public double attack() {
        return getDamage() + this.poison();
    }

    @Override
    public boolean hasBleedingDmg() {
        return false;
    }

    @Override
    public boolean hasPoisonDmg() {
        return true;
    }
}
