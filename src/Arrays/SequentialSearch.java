package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		Scanner input=new Scanner(System.in);
ArrayList<Integer> number=new ArrayList<Integer>();
boolean search=false;
for(int i=0;i<1000;i++)
{
	number.add(1+generator.nextInt(1600-1+1));
}
System.out.println("Enter score");
int score=input.nextInt();
for(int i=0;i<1000;i++)
{
	if(number.get(i)==score)
	{
		search=true;
	}
}
if(search==true)
{
	System.out.println("ITS IN THERE");
	}
else
{
	System.out.println("ITS NOT IN THERE");
}
}
}