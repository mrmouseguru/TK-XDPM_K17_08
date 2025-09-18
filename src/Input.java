import java.util.Scanner;

public class Input implements InputInterface{
	private Scanner in;
	
	
	public Input(Scanner in) {
		this.in = in;
	}


	@Override
	public int input() {
		return in.nextInt();
		
	}

}
