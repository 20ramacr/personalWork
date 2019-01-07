package Arrays;
	import java.util.Scanner;
		import java.util.Random;
		
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		Random generator=new Random();
		int students=0;
		int sides=0;
		int times=0;
		int value=0;
		int numTimes=0;
		System.out.println("Students:");
		students=input.nextInt();
		System.out.println("Sides:");
		sides=input.nextInt();
		System.out.println("times:");
		times=input.nextInt();
		System.out.println("value:");
		value=input.nextInt();
		int[][] array= new int[students][times];
		for(int row=0;row<students;row++)
		{
			for(int column=0;column<times;column++)
			{
				int randomNum=1+generator.nextInt(sides-1+1);
				array[row][column]=randomNum;
				if(array[row][column]==value)
				{
					numTimes++;
				}
				System.out.print(array[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println("Number times value was rolled:" +numTimes);
		}

		

	}


