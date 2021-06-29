package DungeonSource;

/**
 * Title: Description: Copyright: Copyright (c) 2001 Company:
 * 
 * @author
 * @version 1.0
 */

public class Skeleton extends Monster {

	public Skeleton() {
		super("Sargath the Skeleton", 100, 3, .8, .3, 30, 50, 30, 50);

	}// end constructor

	public void attack(DungeonCharacter opponent) {
		System.out.println(name + " slices his rusty blade at " + opponent.getName() + ":");
		super.attack(opponent);

	}// end override of attack

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

	@Override
	void subtractHitPoints() {
		// TODO Auto-generated method stub
		
	}

}// end class Skeleton