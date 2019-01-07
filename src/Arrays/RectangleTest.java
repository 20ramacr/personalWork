package Arrays;
import java.util.Random;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
int numRectangles=100;
int smallestArea=1000000;
int smallestIndex=0;
int min=10;
int max=56;

Rectangle[] rectangle= new Rectangle[100];
for(int i=0;i<rectangle.length;i++)
{
	int width= min +generator.nextInt(max-min+1);
	int length=min + generator.nextInt(max-min+1);
	Rectangle rhea =new Rectangle(width,length);
	rectangle[i]=rhea;
	if(rectangle[i].area()<=smallestArea)
	{
	smallestArea=rectangle[i].area();	
	smallestIndex=i;
	}
}
System.out.println("smallest area:"+smallestArea);
System.out.println("index:"+smallestIndex);
rectangle[0]=rectangle[smallestIndex];
}
	}


