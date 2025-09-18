import java.io.PrintWriter;

public class Output implements OutputInterface{
	private PrintWriter out;
	
	
	
	public Output(PrintWriter out) {
		this.out = out;
	}



	@Override
	public void output(String result) {
		// TODO Auto-generated method stub
		out.println(result);
		out.flush();
	}

}
