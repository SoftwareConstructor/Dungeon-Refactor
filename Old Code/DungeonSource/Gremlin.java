package DungeonSource;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

    public Gremlin()
	{
		super("Gnarltooth the Gremlin", 70, 5, .8, .4, 15, 30, 20, 40);

    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		// changing the name to original name 
		System.out.println("Germlin" + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack

		// -----------------------------------------------------------------
		@Override
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



}//end class Gremlin