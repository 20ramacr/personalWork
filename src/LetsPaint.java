import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TALL = 8;
		int length = 0;
		int width = 0;
		int area = 0;
		double totalGallons = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		length = input.nextInt();
		System.out.println("What is the width?");
		width = input.nextInt();
		area = width * length * TALL;
		System.out.println("The area of the room is" + area);
		totalGallons = area * 150;
		System.out.println("The total gallons of paint is" + totalGallons);
				
	}

}
