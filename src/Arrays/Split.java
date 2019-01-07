package Arrays;
import java.util.Scanner;
import java.util.Random;
public class Split {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	Random generator=new Random();
	System.out.println("enter sentence");
	String sentence =input.nextLine();
	String[] number = sentence.split(" ");
	int iMin=0;
	int iMax=number.length;
	
	int randomNum= iMin+generator.nextInt(iMax-iMin+1);
	System.out.println(number[randomNum]);
	
	
}
}