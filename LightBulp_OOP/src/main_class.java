import button_packg.Button;
import button_packg.click;
import light_b.Lightbulp;

public class main_class {

	public static void main(String[] args) {
		click lb = new Lightbulp();
		System.out.println("Creating a button");
		click new_button = new Button(lb);
		new_button.switchOn();
		new_button.switchOff();
		
		System.out.println("\nCreating a table lamb");
		Button button = new Button(lb);
		click tableLamb = new table_l(button);
		tableLamb.switchOn();
		tableLamb.switchOff();
		
		System.out.println("\nTrying push button");
		button.PushButton();
		button.PushButton();
	}

}
