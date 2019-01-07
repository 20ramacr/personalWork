package Arrays;
import java.util.Scanner;
public class FirstNameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numFriends=20;
String[] name= new String[numFriends];
Scanner input=new Scanner(System.in);
for(int i=0;i<=name.length-1;i++)
{
	System.out.println("enter name");
	name[i]=input.nextLine();
}
input.nextLine();
System.out.println("Enter length");
int length=input.nextInt();
for(int i=0;i<name.length;i++)
{
	if(name[i].length()==length)
	{
	System.out.println(name[i]);
	}
}
	}

}
