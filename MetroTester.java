class MetroTester{

public static void main(String args[]){

	Metro.addMetro("rajajinagar");
	Metro.addMetro("magadi road");
	Metro.addMetro("mejastic");
	Metro.addMetro("m g road");
	Metro.addMetro("peenya");
	Metro.addMetro("dasarahalli");
	Metro.addMetro("nagasandra");
	Metro.addMetro("hosahalli");
	
	Metro.getMetroStation();
	
	Metro.updateStation("rajajinagar","Rajajinagar");
	Metro.updateStation("magadi road","Magadi road");
	Metro.updateStation("mejastic","Mejastic");
	Metro.updateStation("m g road","M G road");
	Metro.updateStation("peenya","Peenya");
	Metro.updateStation("dasarahalli","Dasarahalli");
	Metro.updateStation("nagasandra","Nagasandra");
	Metro.updateStation("hosahalli","Hosahalli");
	
	Metro.getMetroStation();
	Metro.deleteStation("Rajajinagar");
	
	Metro.getDeletedStation(5);
}
}