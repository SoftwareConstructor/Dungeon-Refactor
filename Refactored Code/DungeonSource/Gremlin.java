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
		super("Gnarltooth the Gremlin", 80, 5, .8, .4, 15, 30, 20, 40);

    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		// changing the name to original name 
		System.out.println("Germlin" + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Gremlin