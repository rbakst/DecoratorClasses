package decoratorClasses;

public class DecoratorMain {

	public static void main(String[] args) {

		Base b = new Div("Touro");
		b = new Strong(b);
		b = new A(b, "www.touro.edu");
		b =  new U(b);
		b = new Em(b);
		
		System.out.println(b.getString());

		Base c = new H("", 1);
		c = new Strong(c);
		c = new A(c, "www.touro.edu");
		c =  new U(c);
		c = new Em(c);
		
		System.out.println(c.getString());
		
		Base d = new Input("test", "button", "onclick", "javascript:alert('action')", "action");
		d= new Small(d);
		System.out.println(d.getString());
		
	}


}
