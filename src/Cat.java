
public class Cat {
		private double age;
private double sleep;

		public Cat(){
			age = -99.0;
			sleep = -99.0;
			
		}
		public Cat(double newAge, double newSleep){
			age = newAge;
			sleep = newSleep;
		}
		public void setAge( double newAge){
			age = newAge;
		}
			public double getAge(double newAge){
				return age;
		}
		public void birthday(){
		
		age=age+1;
		System.out.println("the cat had a birthday. Now it is" +age +"years old");
		}
		public void setSleep( double newSleep){
			sleep = newSleep;
		}
			public double getSleep(double newSleep){
				return sleep;
			}
		public void sleepMore(){
		System.out.println("The cat only sleeps"+ sleep +"hours. He needs to sleep more");
		}
		public void sleepLess(){
			System.out.println("The cat sleeps"+ sleep +"hours. He needs to sleep less");	
	
		}}
