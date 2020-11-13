import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestCases {

	@Test
	public void CreatingAThing() {
		Thing g = new Thing("Hello");
		assertEquals("Hello", g.toString());
	}
	
	@Test
	public void CreatingACreature() {
		Creature g = new Bat("Hello");
		assertEquals("Hello Bat", g.toString());
	}
	
	@Test
	public void Empty_Stomach() {
		Creature g = new Ant("Hello");
		assertNull(g.lastThingAte);
		
	}
	
	@Test
	public void eating() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Bat g = new Bat("Ezra");
		Ant a = new Ant("O");
		g.eat(a);
		assertEquals(g.toString() + " has just eaten a "+ a.toString() + "\n", output.toString());
	}
	
	@Test
	public void EmptyStomach() {

		Bat g = new Bat("Ezra");
		Ant a = new Ant("O");
		g.eat(a);
		
		assertEquals(a.toString(), g.getLastThingAte().toString());
	}
	

	@Test
	public void testSystemOut() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Bat g = new Bat("Ezra");
		g.move();
		assertEquals(g.toString() + " is swooping through the dark."+ "\n", output.toString());
	}
	
	@Test
	public void whatDidItEat() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Bat g = new Bat("Ezra");
		g.whatDidYouEat();
		assertEquals(g.toString() + " has had nothing to eat!"+ "\n", output.toString());
	}
	
	@Test
	public void whatDidItEat2() {
		Bat g = new Bat("Ezra");
		Ant a = new Ant("w");
		g.eat(a);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		g.whatDidYouEat();
		assertEquals(g.toString() + " has eaten a " + g.getLastThingAte() + "!"+ "\n", output.toString());
		
	}
	
	@Test
	public void antMove() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Ant a = new Ant("w");
		a.move();
		
		assertEquals(a.toString()+ " is crawling around"+ "\n", output.toString());
		
	}
	@Test
	public void TigerMove() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Tiger tg = new Tiger("w");
		tg.move();
		
		assertEquals(tg.toString() + " has just pounced."+ "\n", output.toString());
		
	}
	@Test
	public void FlyMove() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Fly tg = new Fly("w");
		tg.move();
		
		assertEquals(tg.toString() + " is buzzing around in flight."+ "\n", output.toString());
		
	}
	
	@Test
	public void eatforBat() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Bat tg = new Bat("w");
		Thing t = new Thing("tg");
		tg.eat(t);
		
		assertEquals(tg.toString() + " won't eat a "+ t.toString() + "\n", output.toString());
		
	}
	
	@Test
	public void eatforFly() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Fly tg = new Fly("w");
		Creature t = new Bat("tg");
		tg.eat(t);
		
		assertEquals(tg.toString() + " won't eat a "+ t.toString() + "\n", output.toString());
		
	}
	@Test
	public void eatforFly2() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		Fly tg = new Fly("w");
		Thing t = new Thing("tg");
		tg.eat(t);
		
		assertEquals(tg.toString() + " has just eaten a " + tg.getLastThingAte() + "\n", output.toString());
		
	}
	
	@Test
	public void testcr() {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String[] args = {};
		TestCreature.main(args);
		String s = "Things: " + "\n"+"\n";
	    String str ="Creatures: "+ "\n" + "\n" + "Ezra Ant" + "\n" + "Joe Bat" + "\n" + "Maria Tiger" + "\n" + "Vincent Fly" + "\n" + "\n";
	    String str2 = "Glass" + "\n" + "Pen" + "\n" + "Ezra Ant" + "\n" + "Joe Bat" + "\n" + "Maria Tiger" + "\n" + "Vincent Fly" + "\n" + "\n";
	    String str3 = "Move: " + "\n" + "\n";
	    String str4 = "Ezra Ant is crawling around" + "\n" +
"Joe Bat is swooping through the dark." + "\n"+
"Maria Tiger has just pounced." + "\n" +
"Vincent Fly is buzzing around in flight." + "\n" +"\n";
	    String str5 = "Before eating: " + "\n" + "\n";
	    String str6 = "Ezra Ant has had nothing to eat!" + "\n" +
"Joe Bat has had nothing to eat!" + "\n" +
"Maria Tiger has had nothing to eat!"+ "\n" +
"Vincent Fly has had nothing to eat!"+ "\n" + "\n";
	    String str7 = "Eating: "+ "\n" + "\n";
	    String str8 = "Ezra Ant has just eaten a Joe Bat"+ "\n" +
	    		"Joe Bat has just eaten a Ezra Ant"+ "\n" +
	    		"Maria Tiger has just eaten a Maria Tiger"+ "\n" +
	    		"Vincent Fly has just eaten a Pen"+ "\n"+"\n" ;
	    String str9 = "Exceptions: " + "\n" + "\n";
	    String str10 = "Joe Bat won't eat a Glass" + "\n" +
	    		"Vincent Fly won't eat a Joe Bat" + "\n" + "\n";
	    String str11 = "After eating: " + "\n" + "\n";
	    String str12 = "Ezra Ant has eaten a Joe Bat!"+ "\n" +
	    		"Joe Bat has eaten a Ezra Ant!"+ "\n" +
	    		"Maria Tiger has eaten a Maria Tiger!"+ "\n" +
	    		"Vincent Fly has eaten a Pen!"+ "\n" ;

	    assertEquals(s+str2+str+str3+str4+str5+str6+str7+str8+str9+str10+str11+str12, output.toString());
	   
		
	}
	
	
	
	
	
	
}
