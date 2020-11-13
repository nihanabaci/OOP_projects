
public class TestCreature {
	
	
	public static final int THING_COUNT = 6;
	public static final int CREATURE_COUNT = 4;

	public static void main(java.lang.String[] args) {
		
		Creature cr[]= new Creature[CREATURE_COUNT];
		
	    cr[0] = new Ant("Ezra");
	    cr[1] = new Bat("Joe");
	    cr[2] = new Tiger("Maria");
	    cr[3] = new Fly("Vincent");
	   
	    Thing tg[] = new Thing[THING_COUNT];
	    
	    tg[0] = new Thing("Glass");
	    tg[1] = new Thing("Pen");
	    
	    
	    for(int i=0; i<CREATURE_COUNT; i++)
	    {
	    	tg[i+2] = cr[i];
	    }
    
	    System.out.println("Things: ");
	    System.out.println();
	    
	    for(int i=0; i<THING_COUNT; i++)
	    {
	    	System.out.println(tg[i]);
	    }
	     System.out.println();
	    
	    System.out.println("Creatures: ");
	    System.out.println();
	    
	    for(int i=0; i<CREATURE_COUNT; i++)
	    {
	    	System.out.println(cr[i]);
	    }
	    
	    
	    System.out.println();
	    System.out.println("Move: ");
	    System.out.println();
	    
	    cr[0].move();
	    ((Bat) cr[1]).fly();
	    cr[2].move();
	    ((Fly) cr[3]).fly();
	    
	    System.out.println();
	    System.out.println("Before eating: ");
	    System.out.println();
	    
	    for(int i=0; i<CREATURE_COUNT; i++)
	    {
	    	cr[i].whatDidYouEat();
	    }
	    
	    System.out.println();
	    System.out.println("Eating: ");
	    System.out.println();
	    
	    cr[0].eat(cr[1]);
	    cr[1].eat(cr[0]);
	    cr[2].eat(cr[2]);
	    cr[3].eat(tg[1]);
	    
	    System.out.println();
	    System.out.println("Exceptions: ");
	    System.out.println();
    
	    cr[1].eat(tg[0]);
	    cr[3].eat(cr[1]);
	    
	    System.out.println();
	    System.out.println("After eating: ");
	    System.out.println();
	    
	    for(int i=0; i<CREATURE_COUNT; i++)
	    {
	    	cr[i].whatDidYouEat();
	    }
	   
	    
    	
	}

}
