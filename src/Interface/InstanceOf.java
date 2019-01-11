package Interface;
import java.util.ArrayList;
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Person> people=new ArrayList<Person>();
people.add(new Teacher());
people.add(new Teacher());
people.add(new Student());
people.add(new Student());
for(int i=0;i<4;i++)
{ 
	if(people.get(i) instanceof Student)
	{
		Student kid=(Student)people.get(i);
		kid.outSick();
	}
	System.out.println(people.get(i).getName());
}
	}

}
