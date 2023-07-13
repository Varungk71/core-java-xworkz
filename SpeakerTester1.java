class SpeakerTester1{

public static void main(String args[]){
	
	boolean connected=Speaker1.onOrOff();
	System.out.println("Is speaker connected " + connected);
	boolean value=Speaker1.onOrOff();
	System.out.println("Is speaker connected " + value);
	
	Speaker1.increaseVolume();
	//System.out.println("volume increased " + volume1);
	Speaker1.increaseVolume();
	Speaker1.increaseVolume();
	Speaker1.increaseVolume();
	Speaker1.increaseVolume();
	boolean connected1=Speaker1.onOrOff();
	System.out.println("Is speaker connected " + connected1);
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
		Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();

	
	
}
}