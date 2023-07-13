class MixerTester{

public static void main(String args[]){
	
	boolean on =Mixer.onOrOff();
	System.out.println("Is mixer on " + on);
	boolean value=Mixer.onOrOff();
	System.out.println("Is mixer on  " + value);
	
	Mixer.increaseSpeed();
	//System.out.println("Speed increased " + Speed1);
	Mixer.increaseSpeed();
	
	boolean connected1=Mixer.onOrOff();
	System.out.println("Is Mixer on  " + connected1);
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	
	
	
}
}