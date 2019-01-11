package Interface;
import java.util.Random;
public class Employee {
private String name;
private double rate;
private double[] hours=new double[52];
private static int employeeClassNum=0;
private int employeeNum;
public Employee(){
	Random generator=new Random();
	name="john smith";
	rate=10.0;
for(int i=0;i<52;i++)
{
	hours[i]=0+generator.nextInt(40-0+1);
}
employeeNum=employeeClassNum;
employeeClassNum++;
}
public void modifyRate(double value){
rate=rate+value;
}
public double calcPay (int weekNum){
	double amount=hours[weekNum-1]*rate;
	return amount;
}
}
