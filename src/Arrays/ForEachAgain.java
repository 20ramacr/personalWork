package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ForEachAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double highest=0.0;
		Scanner input= new Scanner(System.in);
		ArrayList<Double> wages= new ArrayList<Double>();
		System.out.println("Number of employees");
		int employees=input.nextInt();
		for(int i=0;i<employees;i++)
		{System.out.println("Enter wage");
			
			double wage=input.nextDouble();
			wages.add(i,wage);
		}
		for(double i:wages)
		{
			if(i>highest)
			{
				highest=i;
			}
		}
		System.out.println("highest wage:"+ highest);
	}

}
