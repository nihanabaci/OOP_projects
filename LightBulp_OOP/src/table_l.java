import button_packg.Button;
import button_packg.click;
//import button_packg.click;

public class table_l implements click{
	
	Button button;
	click lb;
	
	public table_l(Button b)
	{
		this.button =b;
	}
	@Override
	public void switchOn() {
		button.switchOn();
		
	}
	@Override
	public void switchOff() {
		button.switchOff();
		
	}
	@Override
	public boolean isOn() {
		return button.isOn();
	}
	

}
