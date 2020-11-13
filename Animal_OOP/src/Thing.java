

public class Thing {
	
	private String name;
	
	public Thing(String n)
	{
		this.name = n;
	}
	

	public java.lang.String toString()
	{
		 String className = getClass().getSimpleName();
		 String str = "";
		 if(className == "Thing" )
		 {
			 str = this.name;
		 }
		 else
		 {
			 str = this.name + " " + className;
		 }
		 return str;
	}


	
	
	
}
