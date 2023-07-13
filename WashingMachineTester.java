class WashingMachineTester{

public static void main(String args[]){
	
	boolean turnedOn=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine turnedOn " + turnedOn);
	boolean value=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine turnedOn " + value);
	
	WashingMachine.increaseTime();
	//System.out.println("Time increased " + Time1);
	WashingMachine.increaseTime();
	WashingMachine.increaseTime();
	WashingMachine.increaseTime();
	WashingMachine.increaseTime();
	boolean turnedOn1=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine turnedOn " + turnedOn1);
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	
	
	
}
}