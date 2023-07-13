class TelevisionTester{

public static void main(String args[]){
	
	boolean turnedOn=Television.onOrOff();
	System.out.println("Is Television turnedOn " + turnedOn);
	boolean value=Television.onOrOff();
	System.out.println("Is Television turnedOn " + value);
	
	Television.increaseVolume();
	//System.out.println("volume increased " + volume1);
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	boolean turnedOn1=Television.onOrOff();
	System.out.println("Is Television turnedOn " + turnedOn1);
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	
	
}
}