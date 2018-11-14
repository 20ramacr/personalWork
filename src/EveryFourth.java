import java.util.Scanner;

public class EveryFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence=input.nextLine();
		int length=sentence.length();
		for (int number=0;number<length;number=number+4)
		{
			System.out.println(sentence.charAt(number));
		}
	}

}
