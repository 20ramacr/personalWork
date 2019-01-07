package Arrays;
import java.util.Scanner;
public class OneDemensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int sum=0;
		int[] score=new int[5];
Scanner input=new Scanner(System.in);
for( counter=0;counter<=4;counter++)
{
System.out.println("Enter test score");
score[counter]=input.nextInt();

}
for(counter=4;counter>=0;counter--)
{
System.out.println(score[counter]);	
}

	}
}
