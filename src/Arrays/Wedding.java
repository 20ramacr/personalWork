package Arrays;
import java.util.Scanner;
	public class Wedding {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number of people (Multiple of 8)");
	int people=input.nextInt();
	int columns=8;
	int rows=people/8;
	int row=0;
	int column=0;
	Friends[][] seats=new Friends[rows][columns];
	for(row=0;row<rows;row++)
	{
		for(column=0;column<columns;column++)
		{
			System.out.println("enter name first and last");
			String name=input.nextLine();
			input.nextLine();
			System.out.println("Enter age");
			int age=input.nextInt();
			input.nextLine();
			Friends rhea=new Friends(name,age);
			
			seats[row][column]=rhea;
	
			
		}
	}
	for(row=0;row<rows;row++)
	{
		for(column=0;column<columns;column++)
		{
			System.out.print(seats[row][column]+" ");
			
		}
		System.out.println();
	}
	for(row=0;row<rows;row++)
	{
		for(column=0;column<columns;column++)
		{
			System.out.println((seats[row][column].getName().substring(seats[row][column].getName().indexOf(" ")))+" ");
			
		}
		System.out.println();
	}

		}

	}


