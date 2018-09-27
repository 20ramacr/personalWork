import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double value = 0.0;
double dollars = 0.0;
double quarters = 0.0;
double dimes = 0.0;
double nickels = 0.0;
double pennies = 0.0;
Scanner input = new Scanner(System.in);
System.out.println("What is the amount of change?");
value = input.nextDouble();
dollars = (int)value; 
System.out.println("The amount of dollars is " + dollars);
quarters = (int)((value - dollars) / .25);
System.out.println("The amount of quarters is " + quarters);
dimes = (int)(((value - dollars) % .25) / .10);
System.out.println("The amount of dimes is " + dimes);
nickels = (int)(((value - dollars) % .25) % .10) / .05;
System.out.println("The amount of nickels is " + nickels);
	}

}
