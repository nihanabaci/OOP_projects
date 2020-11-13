package button_packg;

import edu.princeton.cs.algs4.StdOut;
import button_packg.click;


public class Button implements click{
	
	private click lightbulb_i;
	public boolean isOn; //false for off
	
	public click cl;
	
	public Button(click lb)
	{
		this.lightbulb_i = lb;
		
	}


	@Override
	public void switchOn() {
		StdOut.print("Button switched to ON\n");
		lightbulb_i.switchOn();
		this.isOn = true;
		
	}

	@Override
	public void switchOff() {
		StdOut.print("Button switched to OFF\n");
		lightbulb_i.switchOff();
		this.isOn = false;
		
	}
	

	@Override
	public boolean isOn() {
		return this.isOn;
		
	}
	
	public void PushButton()
	{
		if(isOn() == true)
		{
			this.switchOn();
			isOn = false;
		}
		else
		{
			this.switchOff();
			isOn = true;
		}
	}
	
	
	

}
