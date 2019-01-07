package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class AnotherSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		Scanner input=new Scanner(System.in);
ArrayList<Rectangle> number=new ArrayList<Rectangle>();
boolean search=false;
int numberTimes=0;
for(int i=0;i<100;i++)
{
	int width=0+generator.nextInt(499-0+1);
	int length=0+generator.nextInt(499-0+1);
	Rectangle rhea=new Rectangle(length, width);
	number.add(rhea);
}

for(int i=0;i<100;i++)
{
	if(number.get(i).getWidth()==10)
	{
		search=true;
		numberTimes++;
	}
}
if(search==true)
{ 
	System.out.println("ITS IN THERE "+ numberTimes + " TIMES");
	}
else
{
	System.out.println("ITS NOT IN THERE");
}
}
}