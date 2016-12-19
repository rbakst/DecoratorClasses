package decoratorClasses;

public abstract class Base {
		
		String name = "unknownTag";
		String idAttribute = "unknownAttribute";
		String text = "unknownText";
		
		public String getString(){
			return name + text + idAttribute;
		}
		
		
		
	
}
