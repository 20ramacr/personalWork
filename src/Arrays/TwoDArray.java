package Arrays;
import java.util.Random;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
int rows=14;
int columns=9;
int[][] array= new int[rows][columns];
 for(int rowCount=0;rowCount<rows;rowCount++)
 {
	 for(int columnCount=0;columnCount<columns;columnCount++)
	 {
	array[rowCount][columnCount]=1+generator.nextInt(9-1+1);
	System.out.print(array[rowCount][columnCount]+" ");

	 }
System.out.println();
 }
 
	}

}
