package decoratorClasses;

public class H extends Base{
	
	int number;
	
	public H(String text, int number) {
	
		if (number >= 1 && number <=6){
			name = "<h" + number + ">";
			idAttribute ="</h>";
			this.text = text;
		}
	
	}
}
