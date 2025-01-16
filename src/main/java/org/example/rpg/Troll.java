package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double dmg) {
        super(name, hitPoints, dmg);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.30;
    }
}
