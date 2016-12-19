package decoratorClasses;

public class U extends Decorator{
	
	private Base b;
	
	public U(Base b){
		
		this.b = b;
		name = "<u>";
		idAttribute ="</u>";
	}

	public String getString()
	{
		return name + b.getString() + idAttribute;
	}
	

}
