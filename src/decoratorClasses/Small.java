package decoratorClasses;

public class Small extends Decorator{
	
	private Base b;
	
	public Small( Base b){
		
		this.b = b;
		name = "<small>";
		idAttribute ="</small>";
		this.text = text;
	}

	public String getString()
	{
		return name +  b.getString() + idAttribute;
	}

}
