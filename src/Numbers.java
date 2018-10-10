
public class Numbers {

	//instance fields - data storage
	// constructors- methods for constructing the object
	//default constructor
	public void sayNumber(double num){
	System.out.println("your number is" + num);
	}
	public void sayNumberPlus2(double parameter){
		System.out.println("You sent" + parameter + "to the method");
		parameter = parameter + 2;
		System.out.println("Your number plus two is" + parameter);
	}
	public double returnSquare(double num){
		double answer = num*num;
		return answer;
	}
	public double returnArea(double length, double width){
		double lengthTriangle= 2.0;
				double widthTriangle = 2.0;
				double answer = lengthTriangle * widthTriangle;
		return answer;
	}
	public int returnRoundUp(double num){
		int temp = (int)Math.ciel(num);
		return temp;
	}
	public Numbers() {
		//Statements to initialize the state of the object
	}
	//methods- things the object can do 

}


