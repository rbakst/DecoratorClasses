package decoratorClasses;


import java.util.Scanner;

public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Base: ");
		String base = keyboard.next();
		System.out.println("Enter Text: ");
		String text = keyboard.next();
		String inputType;
		String eventAction;
		String eventString;
		int inputValue;
		
		
		int number;
		
		Base b;
		boolean redo = false;
		
		do{
			switch(base)
			{
			case "div":
				b = new Div(text);
				break;
			case "p":
				b = new P(text);
				break;
			case "h":
				System.out.println("Enter number: ");
				number = keyboard.nextInt();
				b = new H(text, number);
				break;
			case "input":
				System.out.println("Enter type: ");
				inputType = keyboard.next();
				System.out.println("Enter event action (onclick, onblur): ");
				eventAction = keyboard.next();
				System.out.println("Enter event string: ");
				eventString = keyboard.next();
				System.out.println("Enter input value: ");
				inputValue = keyboard.nextInt();
				
				b = new Input(text, inputType, new Event(eventAction, eventString), inputValue);
				break;
			default:
				System.out.println("Invalid base");
				redo = true;
			}
		}while (redo);
		
		int choice;
		
		while (choice!=7){
		
		choice = decoratorMenu();
		
		
		}*/
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

	/*public int decoratorMenu(){
		
		
		System.out.println("Decorators\n1.  ");
	}*/
}
