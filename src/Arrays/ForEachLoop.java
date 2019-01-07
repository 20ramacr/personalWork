package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
ArrayList<Integer> ages= new ArrayList<Integer>();
int total=0;
System.out.println("Enter number of students.");
int number=input.nextInt();
for(int i=0;i<number;i++)
{ System.out.println("Enter age");
int age=input.nextInt();
	ages.add(i,age);
	
}

for(int i:ages)
{
	total=total+i;
}
System.out.println("Average:" + (total/(number*1.0)));
}

}
