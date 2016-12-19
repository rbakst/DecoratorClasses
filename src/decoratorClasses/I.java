package decoratorClasses;

public class I extends Decorator{

	private Base b;
	
	public I(Base b){
		
		this.b = b;
		name = "<i>";
		idAttribute ="</i>";
	}

	public String getString()
	{
		return name +  b.getString() + idAttribute;
	}
}
