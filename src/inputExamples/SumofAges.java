package inputExamples;
import java.util.Scanner;
public class SumofAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageOne = 0;
		int ageTwo = 0;
		int ageThree = 0;
		int combinedAges = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age friend 1?");
		ageOne = input.nextInt();
		System.out.println("What is your age friend 2?");
		ageTwo = input.nextInt();
		System.out.println("What is your age friend 3?");
		ageThree = input.nextInt();
		combinedAges = ageOne + ageTwo + ageThree;
		System.out.println("The sum of your ages is " + combinedAges);
	}

}
