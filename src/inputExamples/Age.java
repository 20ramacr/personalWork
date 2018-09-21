package inputExamples;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 0;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
age = age + 7;
System.out.println("In 7 years, you will be " + age);
	}

}
