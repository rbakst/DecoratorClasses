package decoratorClasses;

public class Strong extends Decorator{
	
	private Base b;
	
	public Strong(Base b){
		
		this.b = b;
		name = "<strong>";
		idAttribute ="</strong>";
	}

	public String getString()
	{
		return name +  b.getString() + idAttribute;
	}
		

}
