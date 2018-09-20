package inputExamples;
import java.util.Scanner;
public class AgeandWeight {
	public static void main(String[] args) {
int age = 0;
double weight = 0.0;
Scanner input = new Scanner(System.in);
System.out.println("how old are you?");
age = input.nextInt();
System.out.println("how much do you weigh?");
weight = input.nextInt();
System.out.println("I am " + age + " and I weigh " + weight + " pounds");
}}
