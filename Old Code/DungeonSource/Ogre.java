package DungeonSource;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster
{

    public Ogre()
	{
		super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50);


    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack

		// -----------------------------------------------------------------
		public void heal() {
			boolean canHeal;
			int healPoints;
	
			canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);
	
			if (canHeal) {
				healPoints = (int) (Math.random() * (maxHeal - minHeal + 1)) + minHeal;
				addHitPoints(healPoints);
				System.out.println(name + " healed itself for " + healPoints + " points.\n"
						+ "Total hit points remaining are: " + hitPoints);
				System.out.println();
			} // end can heal
	
		}// end heal method
	
		// -----------------------------------------------------------------
		@Override
		public void subtractHitPoints(int hitPoints) {
			super.subtractHitPoints(hitPoints);
			heal();
	
		}// end method


}//end Monster class