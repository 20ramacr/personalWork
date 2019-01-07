package Arrays;
import java.util.Scanner;
public class FriendsNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numFriends=20;
String[] name= new String[numFriends];
Scanner input=new Scanner(System.in);
for(int i=0;i<name.length;i++)
{
	System.out.println("enter name");
	name[i]=input.nextLine();
}
System.out.println("Enter letter");
String letter=input.next();
for(int i=0;i<=name.length;i++)
{ char lastLetter=name[i].charAt(name[i].length()-1);
	if(lastLetter==letter)
	{
	System.out.println(name[i]);
	}
}
	}

}
