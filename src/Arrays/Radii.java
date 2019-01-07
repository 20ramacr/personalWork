package Arrays;
import java.util.Scanner;
public class Radii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
CircleClass[] radii= new CircleClass[10];
for(int i=0;i<10;i++)
{
	System.out.println("Enter radii");
	double radius=input.nextDouble();
	CircleClass rhea=new CircleClass(radius);
	radii[i]=rhea;
	
}
for(CircleClass bob:radii)
{
	System.out.println(bob.area());
}
	}

}
