
public class touchpad implements mouse, keyboard {

	@Override
	public void press() {
		
		System.out.println("keyboard is pressed");
	}

	@Override
	public void click() {
		
		System.out.println("mouse is clicked");

	}

}
