
public class Fly extends Creature implements Flyer {

	public Fly(String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		System.out.println(this + " is buzzing around in flight.");
		
	}

	@Override
	public void move() {
		this.fly();
		
	}
	public void eat(Thing aThing)
	{
		if(aThing instanceof Creature)
		{
			System.out.println(this + " won't eat a "+ aThing);
		}
		else
		{
			super.eat(aThing);
		}
	
	}
	
	

}
