package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class FriendList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Friends> names = new ArrayList<Friends>();
		Friends one= new Friends("emily", 16);
		Friends two= new Friends("lauren", 16);
		Friends three= new Friends("leah", 16);
		names.add(0, one);
		names.add(0,two);
		names.add(0, three);
	}

}
