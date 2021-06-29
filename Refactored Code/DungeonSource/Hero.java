package DungeonSource;

public abstract class Hero extends DungeonCharacter
{
	private double chanceToBlock;
	protected int numTurns;

  protected Hero(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax,
					 double chanceToBlock)
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
	this.chanceToBlock = chanceToBlock;
	readName();
  }

  public void readName()
  {
		System.out.print("Enter character name: ");
		name = Keyboard.readString();
  }

  public boolean defend()
  {
		return Math.random() <= chanceToBlock;

  }

@Override
public void subtractHitPoints(int hitPoints)
	{
		if (defend())
		{
			System.out.println(name + " BLOCKED the attack!");
		}
		else
		{
			super.subtractHitPoints(hitPoints);
		}


	}
	public void battleChoices(DungeonCharacter opponent)
	{
	    numTurns = attackSpeed/opponent.getAttackSpeed();

		if (numTurns == 0)
			numTurns++;

		System.out.println("Number of turns this round is: " + numTurns);

	}

}