
class Mixer{


	static String name="Butterfly";
	static int minSpeed;
	static int currentSpeed=3;
	static int maxSpeed =6;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Mixer turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Mixer turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseSpeed (){
	
		
		if (isConnected==true){
			
			if(currentSpeed <maxSpeed ){
				currentSpeed =currentSpeed +1;
				System.out.println("the current Speed  is"+ currentSpeed );
			
			
			}else{
			
				System.out.println("max Speed reached");
		}
		
		}else{
			
			System.out.println("Mixer is off");
		
		
		}
	}
	public static void decreaseSpeed (){
		if(isConnected==true){
			
			if(currentSpeed >minSpeed ){
				currentSpeed =currentSpeed -1;
				System.out.println("the current Speed  is " + currentSpeed );
			}else{
				System.out.println("min Speed reached");
			}
		}else {
			System.out.println("Mixer is off");
		}
	}

}