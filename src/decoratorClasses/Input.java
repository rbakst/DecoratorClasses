package decoratorClasses;

public class Input extends Base{


	String type;
	Event event;
	String value;
	
	public Input(String text, String type, String eventAction, String eventString , String value){
		 
		
		
		this.type = type;
		this.event = new Event(eventAction, eventString);
		this.value = value;
		this.text = text;
		name = "<input "  + getType() + getValue() + getEvent()+ ">";
		idAttribute = "</input>";
	}

	public String getType() {
		return "type = \"" + type + "\" " ;
	}

	public String getEvent() {
	
		return  event.getAction() + "=\"" + event.getString() + "\"";
	}

	public String getValue() {
		return "value=\"" +  value + "\" ";
	}
	
	
}
