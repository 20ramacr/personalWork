package Interface;
	public class Quadrilateral{
	private double s1;
private double s2;
private double s3;
private double s4;
public Quadrilateral(){
	s1=2;
	s2=2;
	s3=2;
	s4=2;
}
public Quadrilateral(double news1, double news2, double news3, double news4){
	s1=news1;
	s2=news2;
	s3=news3;
	s4=news4;
}
public void setS1(double news1)
{
	s1=news1;
}
public double getS1(){
	return s1;
}
public void setS2(double news2)
{
	s2=news2;
}
public double getS2(){
	return s2;
}
public void setS3(double news3)
{
	s3=news3;
}
public double getS3(){
	return s3;
}
public void setS4(double news4)
{
	s4=news4;
}
public double getS4(){
	return s4;
}
public double perimeter(){
	double perimeter=s1+s2+s3+s4;
	return perimeter;
}
}

