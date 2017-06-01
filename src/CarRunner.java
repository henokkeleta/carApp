
public class CarRunner {
	
	public static void main(String[] args) {
		
		CarDefinition car1 =new CarDefinition("Porsche","red");
		CarDefinition car2 =new CarDefinition("Jetta","blue");
		car1.setMake("Porsche");
		car1.setColor("red");
		car2.setMake("Jetta");
		car2.setColor("blue");

		int max=50;
		System.out.println(car1.display()+" "+car1.StartIt());
		System.out.println(car2.display()+ " "+car2.StartIt());
		car1.setSpeed(10);
		car2.setSpeed(10);
		System.out.println(car1.display());
		System.out.println(car2.display());
		car1.setSpeed(20);
		System.out.println(car1.display());
		car1.setSpeed(21);
		System.out.println(car1.display());
		car1.setSpeed(50);
		System.out.println(car1.display());
		car1.setSpeed(0);
		car2.setSpeed(0);
		
		System.out.println(car1.display()+" "+" has"+" "+car1.stopIt());
	
		System.out.println(car2.display()+" "+" has"+" "+car2.stopIt());
		}
	//the rest of the code which is commented out can serve as an alternative way and able to track the speed of 
	//both cars
/**
		for(int j=0;j<=max;j++)
		{ 
			car1.setSpeed(j);
		    car2.setSpeed(j);
		          System.out.println(car1.display());
		         System.out.println(car2.display());
		          if(car1.getSpeed()==20)
		          { 
		        	  System.out.println(car1.display()+" "+car1.Acceleration(j));
		          }
		          else if(car1.getSpeed()==21)
		          { 
		        	  System.out.println(car1.display()+" "+car1.Acceleration(j));
		          }
		          else if(j==48)
		          { 
		        	  car2.setSpeed(car1.getSpeed()+1);
		        	  
		          }
		          else if(car2.getSpeed()>car1.getSpeed())
		          { 
		        	  System.out.println(car2.getMake()+" "+" and has passed"+" "+car2.getMake());
		          }
			if(j==50)
			{ 
				System.out.println(car1.display());
			}
			
		}
		car1.setSpeed(-30);
		car2.setSpeed(-30);
		System.out.println(car1.display()+" "+"and has"+car1.stopIt());
		System.out.println(car2.display()+" "+"and has+"+car2.stopIt());

	}
	public static String checkStatus(String make,int speed)
	{ 
		CarDefinition car1 =new CarDefinition(make,speed);
		String status=car1.Acceleration(speed);
		return status;
	}**/
}
