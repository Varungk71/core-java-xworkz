
class Television{


	static String name="Redmi";
	static int minVolume;
	static int currentVolume=10;
	static int maxVolume =20;
	static boolean isTurnedOn;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isTurnedOn==false){
				isTurnedOn=true;
				System.out.println("Television turned on ..");
			}else if(isTurnedOn==true){
				isTurnedOn=false;
				System.out.println("Television turned off..");
			}
			
			return isTurnedOn;
	}
	
	public static void increaseVolume (){
	
		
		if (isTurnedOn==true){
			
			if(currentVolume <maxVolume ){
				currentVolume =currentVolume +1;
				System.out.println("the current Volume  is"+ currentVolume );
			
			
			}else{
			
				System.out.println("max Volume reached");
		}
		
		}else{
			
			System.out.println("Television is off");
		
		
		}
	}
	public static void decreaseVolume (){
		if(isTurnedOn==true){
			
			if(currentVolume >minVolume ){
				currentVolume =currentVolume -1;
				System.out.println("the current Volume  is " + currentVolume );
			}else{
				System.out.println("min Volume reached");
			}
		}else {
			System.out.println("Television is off");
		}
	}

}