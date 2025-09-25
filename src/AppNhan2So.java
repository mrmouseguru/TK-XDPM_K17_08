import java.io.PrintWriter;
import java.util.Scanner;

public class AppNhan2So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		PrintWriter screen = new PrintWriter(System.out);
		
		Input input = new Input(keyboard);
		Output output  = new Output(screen);
		
		Nhan2SoEntity n2so = new Nhan2SoEntity();
		
		Nhan2SoUseCaseControl control  = new 
				Nhan2SoUseCaseControl(input, output, n2so);
		control.execute();

	}

}
