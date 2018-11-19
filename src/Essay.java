
public class Essay {
	private String name;
	private String text;
public Essay(){
name=("Rhea, Ramachandran");
text=("Rhea loves dogs");
}
public void setName(String newName){
	name=newName;	
}
public void setText(String newText){
	text=newText;
}
public String getLastName(){
	int index=name.indexOf(" ") ;
	String lastName=name.substring(index);
	return lastName.toUpperCase();
}
public int getLengthFirst(){
	int index=name.indexOf(" ");
	String firstName=name.substring(0,index);
	return firstName.length()-1;
	
}
public boolean predicate(){
	return name.contains("x");
	
}
public int getNumberWords(){
	int words=1;
	int length= text.length();
	for (int index=0;index<=length-1;index++){
		if(text.charAt(index)==' ')
		{
			words++;
		}
	}
	return words;
}
}
