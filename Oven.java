
class Oven{


	static String name="panasonic";
	static int minTemperature;
	static int currentTemperature=80;
	static int maxTemperature =180;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Oven turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Oven turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseTemperature (){
	
		
		if (isConnected==true){
			
			if(currentTemperature <maxTemperature ){
				currentTemperature =currentTemperature +20;
				System.out.println("the current Temperature  is"+ currentTemperature );
			
			
			}else{
			
				System.out.println("max Temperature  reached");
		}
		
		}else{
			
			System.out.println("Oven is off");
		
		
		}
	}
	public static void decreaseTemperature (){
		if(isConnected==true){
			
			if(currentTemperature >minTemperature ){
				currentTemperature =currentTemperature -20;
				System.out.println("the current Temperature  is " + currentTemperature );
			}else{
				System.out.println("min temperature reached");
			}
		}else {
			System.out.println("Oven is off");
		}
	}

}