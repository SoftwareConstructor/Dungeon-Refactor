package DungeonSource;

public class Ogre extends Monster
{

    public Ogre()
	{
		super("Oscar the Ogre", 200, 2, .6, 30, 50);
		monsterHeal(.1, 30, 50);


    }
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}

}