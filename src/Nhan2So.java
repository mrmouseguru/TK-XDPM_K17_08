import java.util.Scanner;

public class Nhan2So {
	
	void nhan2So() {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		//business rules (quy tắc nghiệp vụ)
		int result = number1 * number2;
		
		System.out.print("Result: " + result);
	}

}
