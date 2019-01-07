package Arrays;
import java.util.Random;
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		int max=1000;
		int[] score=new int[250];
		int largest=0;
Random generator=new Random();
for(int counter=0; counter<score.length;counter++)
{
	score[counter]=min+generator.nextInt(max-min+1);
}
for(int counter=0; counter<score.length;counter++)
{
	if(score[counter]>=largest)
	{
		largest =score[counter];

	}
}
System.out.println(largest);
	}

}
