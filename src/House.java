import java.util.Scanner;
public class House {
	//instance fields - data storage
	// constructors- methods for constructing the object
	//default constructor
	public House() {
		//Statements to initialize the state of the object
	}
	//methods- things the object can do 
public void sayWall()
{ int wallLength= 0;
int wallHeight=0;
int wallArea = 0;
Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	wallLength= input.nextInt();
	System.out.println("What is the height of the wall?");
	wallHeight = input.nextInt();
	
}
public void sayFlat()
{
	System.out.println("There is a flat tire");
}
public void sayThirsty()
{
	System.out.println("The car is out of gas");
}
}
