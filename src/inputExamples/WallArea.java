package inputExamples;
import java.util.Scanner;
public class WallArea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall?");
		area = input.nextInt();
		area = area * 8;
		System.out.println("The area of the wall is " + area + " feet^2");
	}

}
