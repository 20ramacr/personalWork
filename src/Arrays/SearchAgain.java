package Arrays;
import java.util.Scanner;
import java.util.Random;
public class SearchAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		Scanner input=new Scanner(System.in);
		boolean search=false;
		int numberTimes=0;
int[] random= new int[100];
for(int i=0;i<100;i++)
{
	random[i]=0+generator.nextInt(499-0+1);
}
System.out.println("Enter score");
int score=input.nextInt();
for(int i=0;i<100;i++)
{
	if(random[i]==score)
	{
		search=true;
		numberTimes++;
	}
}
if(search==true)
{
	System.out.println("ITS IN THERE "+ numberTimes+ "TIMES");
	}
else
{
	System.out.println("ITS NOT IN THERE");
}
	}

}
