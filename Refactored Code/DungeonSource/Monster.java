package DungeonSource;
public abstract class Monster extends DungeonCharacter
{
	protected double chanceToHeal;
	protected int minHeal;
	protected int maxHeal;

  protected Monster(String name, int hitPoints, int attackSpeed,
				     double chanceToHit,
					 int damageMin, int damageMax
					 )
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
  }

  public void monsterHeal(double chanceToHeal, int minHeal, int maxHeal) {
	this.chanceToHeal = chanceToHeal;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;
  }

  public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(healPoints);
		System.out.println(name + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + hitPoints);
		System.out.println();
	}

  }

@Override
 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();

 }

}