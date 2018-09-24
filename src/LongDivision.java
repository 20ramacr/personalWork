import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend = 0;
int divisor = 0;
int answer = 0;
int remainder = 0;
Scanner input = new Scanner(System.in);
System.out.println("What is the dividend");
dividend = input.nextInt();
System.out.println("What is the divisor?");
divisor = input.nextInt();
answer = dividend/divisor;
remainder = dividend % divisor;
System.out.println("The answer is" + answer + "with a remainder of" + remainder);
	}

}
