package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class NamesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
ArrayList<String> name=new <String> ArrayList();
System.out.println("Number of students:");
int number=input.nextInt();
input.nextLine();
for(int i=0;i<number;i++)
{
	
	System.out.println("Enter name");
	String person=input.nextLine();
	name.add(person);
}
name.remove(0);
name.remove(name.size()-1);
for(int i=0;i<name.size();i++)
{
	System.out.println(name.get(i));
}
	}

}
