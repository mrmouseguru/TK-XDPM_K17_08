
public class Nhan2SoUseCaseControl {
	private InputInterface in;
	private OutputInterface out;
	private Nhan2SoEntity n2so;

	
	
	public Nhan2SoUseCaseControl
	(InputInterface in, OutputInterface out, 
			Nhan2SoEntity n2so) {
		this.in = in;
		this.out = out;
		this.n2so = n2so;
	}



	public void execute() {
		int number1 = in.input();
		int number2 = in.input();
		int result = n2so.nhan2So(number1, number2);
	
		out.output(String.valueOf(result));
	}

}
