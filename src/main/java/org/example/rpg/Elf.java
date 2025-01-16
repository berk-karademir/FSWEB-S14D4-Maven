package org.example.rpg;

public class Elf extends Monster implements Poisonable{


    public Elf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double poison() {
        return 0.20;
    }

    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
