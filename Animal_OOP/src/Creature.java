
public abstract class Creature extends Thing {
	
	public Thing lastThingAte;
	
	public Creature(String name) {
		super(name);
	}

	public void eat(Thing aThing)
	{
		System.out.println(this.toString() +" has just eaten a " + aThing);
		setLastThingAte(aThing);
	}
	
	
	public void setLastThingAte(Thing lst)
	{
		this.lastThingAte = lst;
	}
	public Thing getLastThingAte()
	{
		return this.lastThingAte;
	}
	
	public abstract void move();
	
	public void whatDidYouEat() 
	{
		if(this.getLastThingAte() == null)
		{
			System.out.println(this.toString() + " has had nothing to eat!");
		}
		else
		{
			System.out.println(this.toString() + " has eaten a " + this.getLastThingAte() + "!");
		}
		
		
		
	}
	

}
