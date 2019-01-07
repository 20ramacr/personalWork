package Arrays;
import java.util.ArrayList;
import java.util.Random;
public class RectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
ArrayList<Rectangle> rectangles= new <Rectangle>ArrayList();
for(int counter=0; counter<400; counter++)
{
	int length= 50+generator.nextInt(70-50+1);
	int width= 50+generator.nextInt(70-50+1);
	Rectangle rhea= new Rectangle(length, width);
	rectangles.add(rhea);
}
Rectangle box=rectangles.remove(399);
System.out.println(rectangles.set(0,box));

for(int counter=399; counter>=0; counter--)
{
	System.out.println(rectangles.get(counter).area());
}
	}

}
