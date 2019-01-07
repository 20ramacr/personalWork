package Arrays;
import java.util.Random;
public class AnotherOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int rows=3;
		int columns=7;
		int[][] array= new int[rows][columns];
		int sum=0;
		 for(int rowCount=0;rowCount<rows;rowCount++)
		 {
			 for(int columnCount=0;columnCount<columns;columnCount++)
			 {
				 int randomNum=0+generator.nextInt(100-0+1);
			array[rowCount][columnCount]=randomNum;
			System.out.print(array[rowCount][columnCount]+" ");
			sum=sum+randomNum;

			 }
		System.out.println();
		 }
		 System.out.println("sum:"+sum);
			}

		

	}


