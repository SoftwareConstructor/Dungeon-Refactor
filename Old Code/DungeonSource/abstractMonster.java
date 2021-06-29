package DungeonSource;

abstract class abstractMonster extends DungeonCharacter {

    public abstractMonster(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax) {
        super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
    }

    abstract void heal();
    abstract void subtractHitPoints();

}
