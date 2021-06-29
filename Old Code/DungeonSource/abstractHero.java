package DungeonSource;

abstract class abstractHero extends DungeonCharacter {

    public abstractHero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax) {
        super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
    }

    abstract void readName();
    abstract boolean defend();
    abstract void subtractHitPoints();
    abstract void battleChoices();

}