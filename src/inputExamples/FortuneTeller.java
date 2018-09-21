package inputExamples;
import java.util.Scanner;
public class FortuneTeller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		double weight = 0.0;
		double luckyNumber = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("how much do you weigh?");
		weight = input.nextInt();
		System.out.println("What is your lucky number?");
		luckyNumber = input.nextInt();
		System.out.println("43 years from now, you will be reside number " + luckyNumber + " at the old folks home");
	}

}
