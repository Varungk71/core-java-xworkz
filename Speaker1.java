class Speaker1{


	static String name="JBL";
	static int minVolume;
	static int currentVolume=10;
	static int maxVolume=30;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("speaker turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("speaker turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseVolume(){
	
		
		if (isConnected==true){
			
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("the current volume is"+ currentVolume);
			
			
			}else{
			
				System.out.println("max volume reached");
		}
		
		}else{
			
			System.out.println("Speaker is off");
		
		
		}
	}
	public static void decreaseVolume(){
		if(isConnected==true){
			
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("the current volume is " + currentVolume);
			}else{
				System.out.println("min value reached");
			}
		}else {
			System.out.println("speaker is off");
		}
	}

}