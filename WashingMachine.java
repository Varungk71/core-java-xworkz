class WashingMachine{


	static String name="samsung";
	static int minTime;
	static int defaultTime=30;
	static int maxTime=60;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Washing machine turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Washing machine turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseTime(){
	
		
		if (isConnected==true){
			
			if(defaultTime<maxTime){
				defaultTime=defaultTime+10;
				System.out.println("the current Time is"+ defaultTime + "minutes");
			
			
			}else{
			
				System.out.println("max Time reached");
		}
		
		}else{
			
			System.out.println("Washing machine is off");
		
		
		}
	}
	public static void decreaseTime(){
		if(isConnected==true){
			
			if(defaultTime>minTime){
				defaultTime=defaultTime-10;
				System.out.println("the current Time is " + defaultTime +"minutes");
			}else{
				System.out.println("min value reached");
			}
		}else {
			System.out.println("Washing machine is off");
		}
	}

}