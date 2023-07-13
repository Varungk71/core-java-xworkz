class Speaker{


	static String name="JBL";
	static int minVolume;
	static int currentVolume;
	static int maxVolume=30;
	static boolean isConnected=true;
	
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
	


}