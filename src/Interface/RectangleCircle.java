package Interface;
import java.util.ArrayList;
public class RectangleCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Leah> shape=new ArrayList<Leah>();
Circle rhea=new Circle(2.0);
Circle lauren=new Circle(3.0);
Rectangle emily=new Rectangle(3.0,2.0);
double sum=0;
shape.add(rhea);
shape.add(lauren);
shape.add(emily);
for (int i=0; i<3; i++)
{
	sum= sum+shape.get(i).area();
}
System.out.println("sum of areas:"+sum);
	}

}
