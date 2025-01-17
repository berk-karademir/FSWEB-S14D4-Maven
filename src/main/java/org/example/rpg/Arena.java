package org.example.rpg;

public class Arena {
    public static void main(String[] args) {
        Monster tepeGoz = new Troll("Tepegöz", 10,10);
        Monster tyrande = new Elf("Tyrande", 5, 10);
        Monster asmodeus = new Tiefling("Asmodeus", 7,10);
        Monster muradin = new Dwarf("Muradin", 1,10);
        printMonstersAttackMove(tepeGoz);
        printMonstersAttackMove(tyrande);
        printMonstersAttackMove(asmodeus);
        printMonstersAttackMove(muradin);
    }

    public static void printMonstersAttackMove(Monster monster) {
        boolean hasBleed = monster.hasBleedingDmg(); // Check for bleeding effect
        boolean hasPoison = monster.hasPoisonDmg(); // Check for poisoning effect

        if (hasBleed && hasPoison) {
            System.out.println(monster.getName() + " has attacked. On hit with poison and bleeding damage: " + monster.attack());
        } else if (hasBleed) {
            System.out.println(monster.getName() + " has attacked. On hit with bleeding damage: " + monster.attack());
        } else if (hasPoison) {
            System.out.println(monster.getName() + " has attacked. On hit with poison damage: " + monster.attack());
        } else {
            System.out.println(monster.getName() + " has attacked. On hit: " + monster.attack());
        }
    }

}
