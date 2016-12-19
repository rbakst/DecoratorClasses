package decoratorClasses;

public class A extends Decorator{

	private Base b;
	
	public A(Base b, String href){
		
		this.b = b;
		name = "<a href=\"" + href +"\">";
		idAttribute ="</a>";
	}

	public String getString()
	{
		return name +  b.getString() + idAttribute;
	}
}
