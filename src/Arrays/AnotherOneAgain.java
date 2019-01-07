package Arrays;
import java.util.Scanner;

public class AnotherOneAgain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int rows=4;
int columns=3;
String[][] array= new String[rows][columns];
for(int row=0;row<=rows-1;row++)
{
	for(int column=0;column<=columns-1;column++)
	{
		System.out.println("enter name");
		array[row][column]=input.nextLine();
		
	}
}
for(int row=0;row<=rows-1;row++)
{
	for(int column=0;column<=columns-1;column++)
	{
		System.out.print(array[row][column]+" ");
		
		
	}
	System.out.println();
}
}
}