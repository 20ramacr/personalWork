import java.util.Scanner;
public class CapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter password");
		String password=input.nextLine();
		String password2="hi";
	do
	{
		System.out.println("re-enter password");
		password2=input.nextLine();
		if (password.compareTo(password2)!=0)
		{
			System.out.println("you entered the wrong password");
		}
		}
	while(password.compareTo(password2)!=0);
	}

}
