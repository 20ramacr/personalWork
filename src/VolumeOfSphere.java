import java.util.Scanner;
public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius = 0.0;
double volume = 0.0;
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the circle?");
radius = input.nextDouble();
volume = 4.0/3.0 * 3.14 * radius * radius * radius; 
System.out.println("The volume of the sphere is" + volume);
	}

}
