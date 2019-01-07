package Arrays;
import java.util.Random;
public class MoreThanTwoD {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

Random generator=new Random();
			int rows=3;
			int columns=7;
			int third=9;
			int[][][] array= new int[rows][columns][third];
			int sum=0;
			for(int rowCount=0;rowCount<rows;rowCount++)
			 {
				 for(int columnCount=0;columnCount<columns;columnCount++)
				 {
					 for (int thirdCount=0;thirdCount<third;thirdCount++)
						 {
						 int randomNum=0+generator.nextInt(100-0+1);
						 sum=sum+randomNum;
						 	array[rowCount][columnCount][third]=randomNum;
		
				
						 }
			
			

				 }
			
			 }
			 System.out.println("sum:"+sum);
				}

			

		}


