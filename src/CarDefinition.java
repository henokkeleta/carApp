
public class CarDefinition extends Vehicle{
  
	  
	  private int speed;
	  
	 
	  
	  
	  
	  public CarDefinition()
	  { 
		  super();
		  
		  speed=0;
		 
		
	  }
	  
	  public CarDefinition(String make,int speed)
	  { 
		  super();
		  this.speed=speed;
		  
		 
	  }
	  public CarDefinition(String make,String color)
	  { 
		  super();
		//  this.color=color;
		  
		 
	  }

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	 public String StartIt()
	 { 
		 return "Started!";
	 }
	 public String stopIt()
	 { 
		 return "Stopped!";
	 }
	public String Acceleration(int speed)
	{   
		String status="";
		
		 if(speed==1)
		{   
			
			status= "accelerating";
		}
		else if(this.speed==20)
		{ 
			status= "has stopped to have its emmision checked";
		}
		else if(this.speed==21){ 
			status="passes its emmision test";
		}
		else if(speed!=0){ 
			status="is acclerating"+" "+"with"+speed+"mph";
		}
		
		return status;
	}
    public String display()
    { 
    	return  super.display()+""+this.Acceleration(this.speed);
    }
     
	
	
}
