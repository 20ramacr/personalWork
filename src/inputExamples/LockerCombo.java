package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstDigit = 0;
int secondDigit = 0;
int thirdDigit = 0;
Scanner input = new Scanner(System.in);
System.out.println("What is your first digit?");
firstDigit = input.nextInt();
System.out.println("What is your second digit?");
secondDigit = input.nextInt();
System.out.println("What is your third digit?");
thirdDigit = input.nextInt();
System.out.println("Your combination is" + firstDigit + "-" + secondDigit + "-" + thirdDigit);
	}

}
