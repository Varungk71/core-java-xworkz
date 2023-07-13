class SpeakerTester{

public static void main(String args[]){
	
	//System.out.println("main started");
	boolean connected=Speaker.onOrOff();
	System.out.println("Is speaker connected " + connected);
	boolean value=Speaker.onOrOff();
	System.out.println("Is speaker connected " + value);
	//System.out.println("main ended");
	
}
}