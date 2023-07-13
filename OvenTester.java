class OvenTester{

public static void main(String args[]){
	
	boolean connected=Oven.onOrOff();
	System.out.println("Is Oven connected " + connected);
	boolean value=Oven.onOrOff();
	System.out.println("Is Oven connected " + value);
	boolean connected2=Oven.onOrOff();
	
	Oven.increaseTemperature();
	//System.out.println("Temperature increased " + Temperature1);
	Oven.increaseTemperature();
	Oven.increaseTemperature();
	Oven.increaseTemperature();
	Oven.increaseTemperature();
	boolean connected1=Oven.onOrOff();
	System.out.println("Is Oven on  " + connected1);
	Oven.decreaseTemperature();
	Oven.decreaseTemperature();
	Oven.decreaseTemperature();
	

	
	
}
}