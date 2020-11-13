
public class Bat extends Creature implements Flyer {

	public Bat(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(this + " is swooping through the dark.");
	}
	

	@Override
	public void move() {
		this.fly();
	}
	
	public void eat(Thing aThing)
	{
		if (!(aThing instanceof Creature))
		{
			
			System.out.println(this + " won't eat a "+ aThing);
		}
		else
		{
			super.eat(aThing);
		}
		
	}
	

}
