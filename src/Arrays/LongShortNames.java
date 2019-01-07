package Arrays;
import java.util.Scanner;
public class LongShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longestName="hi";
		String shortestName="wOIYWEUIWUGGAGFSUGFKAFUGUEGFWUEGFWAGFUUFGLUEFGLUEGFLUGFELUGFWAUGFLWEFUGWLIUEGFLWEIUFGLAWUEGFLWEUGFLAUEFGLAEWIUGFLEIUFGWLEUIFGALIUEFGLAWUF";
		int range=0;
Scanner input=new Scanner(System.in);
System.out.println("How many people do you know?");
int numberNames=input.nextInt();
String[]names=new String[numberNames];
for(int i=0;i<names.length;i++)
{
	System.out.println("enter first and last name");
	names[i]=input.nextLine();
	if(names[i].length()>longestName.length())
	{
		longestName=names[i];
	}
	if(names[i].length()<shortestName.length())
	{
        shortestName=names[i];
	}
}
for(int i=0;i<names.length;i++)
{
	System.out.println(names[i]);
}
int longestLength=longestName.length();
int shortestLength=shortestName.length();
System.out.println("longest name:"+longestName);
System.out.println("shortest name:"+shortestName);
System.out.println("range:"+ (longestLength-shortestLength));
	}
}
