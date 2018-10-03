import java.util.Scanner;
public class Room {
	//instance fields - data storage
	// constructors- methods for constructing the object
	//default constructor
	public Room() {
		//Statements to initialize the state of the object
	}
	//methods- things the object can do 
public void area()
{ int wallLength = 0;
int wallHeight = 0;
int wallArea = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	wallLength = input.nextInt();
	System.out.println("What is the height of the wall?");
	wallHeight = input.nextInt();
	
	wallArea = wallHeight * wallLength;
	System.out.println("The area of the wall is" + wallArea);
}
public void areaWithDoor()
{ int wallLength = 0;
int wallHeight = 0;
int doorLength = 0;
int doorHeight = 0;
int roomArea = 0;
Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	wallLength = input.nextInt();
	System.out.println("What is the height of the wall?");
	wallHeight = input.nextInt();
	System.out.println("What is the length of the door?");
	doorLength = input.nextInt();
	System.out.println("What is the height of the door?");
	doorHeight = input.nextInt();

	roomArea = (wallLength*wallHeight)-(doorLength*doorHeight); 
	System.out.println("The area of the wall without the door is" + roomArea);

}}
