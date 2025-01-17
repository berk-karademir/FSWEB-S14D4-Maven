package org.example.rpg;

import org.example.rpg.utils.Constant;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double dmg) {
        super(name, hitPoints, dmg);
    }

    @Override
    public double bleed() {
        return  getDamage() * Constant.BLEED_PERCENTAGE;
    }


    @Override
    public double poison() {
        return  getDamage() * Constant.POISON_PERCENTAGE;
    }

    @Override
    public double attack() {
        return getDamage() + (this.bleed() + this.poison());
    }


    @Override
    public boolean hasBleedingDmg() {
        return true;
    }

    @Override
    public boolean hasPoisonDmg() {
        return true;
    }
}
