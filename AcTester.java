class AcTester{

public static void main(String args[]){
	
	boolean connected=Ac.onOrOff();
	System.out.println("Is speaker connected " + connected);
	boolean value=Ac.onOrOff();
	System.out.println("Is speaker connected " + value);
	
	Ac.increaseTemperature();
	//System.out.println("Temperature increased " + Temperature1);
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	boolean connected1=Ac.onOrOff();
	System.out.println("Is Ac on  " + connected1);
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();

	
	
}
}