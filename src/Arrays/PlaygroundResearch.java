package Arrays;
import java.util.Scanner;

public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

int rows=2;
int columns=2;
int[][]students=new int[rows][columns];
for(int row=0;row<rows;row++)
{
	for(int column=0;column<columns;column++)
	{
		System.out.println("What is the height in inches? 0 if none"); 
		int height=input.nextInt();
		students[row][column]=height;
		
	}
}
int tallest=0;
int shortest=500;
int total=0;
int numStudents=0;
for(int row=0;row<rows;row++)
{
	for(int column=0;column<columns;column++)
	{
		if(students[row][column]>0)
		{
			total= total+students[row][column];
			numStudents++;
			
		}
		if(students[row][column]>tallest)
		{
			tallest=students[row][column];
		}
		if(students[row][column]<shortest&&students[row][column]>0)
		{
			shortest=students[row][column];
		}
	}
}
System.out.println("average:"+(total/(numStudents*1.0)));
System.out.println("tallest:"+tallest);
System.out.println("Shortest:"+shortest);
	}

}
