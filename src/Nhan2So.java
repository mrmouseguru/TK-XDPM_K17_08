
public class Nhan2So {
	private InputInterface in;
	private OutputInterface out;
	
	
	
	public Nhan2So(InputInterface in, 
			OutputInterface out) {
		this.in = in;
		this.out = out;
	}



	int nhan2So() {
		int result;
		//business rules policy
		//business rules (quy tắc nghiệp vụ)
		int number1 = in.input();
		int number2 = in.input();
		result =  number1 * number2;
		
		out.output("Result: " + result);
		
		return result;
	}

}
