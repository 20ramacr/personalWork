package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
ArrayList<String> names = new ArrayList<String>();
names.add(0, "bob");
names.add(1, "joe");
names.add(2, "sue");
System.out.println("Enter name");
names.add(input.nextLine());
	}

	}


