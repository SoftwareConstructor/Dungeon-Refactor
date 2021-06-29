package DungeonSource;

public class Gremlin extends Monster
{

    public Gremlin()
	{
		super("Gnarltooth the Gremlin", 70, 5, .8, 15, 30);
		monsterHeal(.4, 20, 40);

    }
    
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println("Germlin" + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}


}