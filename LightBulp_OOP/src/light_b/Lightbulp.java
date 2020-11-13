package light_b;
import button_packg.click;
import edu.princeton.cs.algs4.StdOut;

public class Lightbulp implements click{
	boolean isOn;
	@Override
	public void switchOn()
		{
			StdOut.println( "Lightbulb on");
			this.isOn = true;
		}
	@Override
	public void switchOff()
	{
		StdOut.println( "Lightbulb off");
		this.isOn = false;
			
	}
	@Override
	public boolean isOn() {
		
		return this.isOn;
	}

}
