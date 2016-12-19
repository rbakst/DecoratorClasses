package decoratorClasses;

public class Em extends Decorator{

	private Base b;
	
	public Em(Base b){
			this.b = b;
			name = "<em>";
			idAttribute ="</em>";
		}
	
	public String getString()
	{
		return name +  b.getString() + idAttribute;
	}
}
