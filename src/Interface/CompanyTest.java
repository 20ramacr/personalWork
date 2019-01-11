package Interface;
import java.util.ArrayList;
import java.util.Scanner;
public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double total=0;
System.out.println("Enter number of employees");
int employees=input.nextInt();
ArrayList<Employee> person=new ArrayList<Employee>();
for(int i=0;i<employees;i++)
{
	Employee bob=new Employee();
	person.add(bob);
}
System.out.println("Enter amount raise");
double raise=input.nextDouble();
person.get(employees-1).modifyRate(raise);
for(int i=0;i<employees;i++)
{
	System.out.println("Employee "+ i+":"+ (person.get(i).calcPay(7)));
	for(int h=0;h<52;h++)
	{
		total=total+ person.get(i).calcPay(h);
	}
}
	System.out.println("total:"+total);
	}

}
