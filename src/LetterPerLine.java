import java.util.Scanner;
public class LetterPerLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence=input.nextLine();
		int max= sentence.length();
		for(int letter=1;letter<=max;letter++)
		{
			System.out.println(sentence.charAt(letter-1));
		}
	}

}
