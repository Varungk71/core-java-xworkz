class Satellitetst{
	
	
	public static void main(String s[]){															
	 
		Satellite satellite = new Satellite();
		satellite.orbit = "meo";
		satellite.mass = "tons";
		satellite.power = "sunlight";
		satellite.communication = "antennas";
		satellite.lifespan = "short";
		satellite.toLanuch();
		System.out.println(satellite.orbit + ", "+ satellite.mass + ", "+ satellite.power + ", "+ satellite.communication + ", "+ satellite.lifespan);
		
		
	Satellite satellite2 = new Satellite();
		satellite2.orbit = "geo";
		satellite2.mass = "tons";
		satellite2.power = "fuel";
		satellite2.communication = "antennas";
		satellite2.lifespan = "long";
		satellite2.toLanuch();
		System.out.println(satellite2.orbit + ", "+ satellite2.mass + ", "+ satellite2.power + ", "+ satellite2.communication + ", "+ satellite2.lifespan);
		
		Satellite satellite3 = new Satellite();
		satellite3.orbit = "meo";
		satellite3.mass = "tons";
		satellite3.power = "fuel";
		satellite3.communication = "transmitters";
		satellite3.lifespan = "long";
		satellite3.toLanuch();
		System.out.println(satellite3.orbit + ", "+ satellite3.mass + ", "+ satellite3.power + ", "+ satellite3.communication + ", "+ satellite3.lifespan);
		
		Satellite satellite4 = new Satellite();
		satellite4.orbit = "geo";
		satellite4.mass = "tons";
		satellite4.power = "sunlight";
		satellite4.communication = "transmitters";
		satellite4.lifespan = "short";
		satellite4.toLanuch();
		System.out.println(satellite4.orbit + ", "+ satellite4.mass + ", "+ satellite4.power + ", "+ satellite4.communication + ", "+ satellite4.lifespan);
		
		Satellite satellite5 = new Satellite();
		satellite5.orbit = "meo";
		satellite5.mass = "tons";
		satellite5.power = "sunlight";
		satellite5.communication = "antennas";
		satellite5.lifespan = "long";
		satellite5.toLanuch();
		System.out.println(satellite5.orbit + ", "+ satellite5.mass + ", "+ satellite5.power + ", "+ satellite5.communication + ", "+ satellite5.lifespan);
		
		Satellite satellite6= new Satellite();
		satellite6.orbit = "geo";
		satellite6.mass = "tons";
		satellite6.power = "sunlight";
		satellite6.communication = "antennas";
		satellite6.lifespan = "long";
		satellite6.toLanuch();
		System.out.println(satellite6.orbit + ", "+ satellite6.mass + ", "+ satellite6.power + ", "+ satellite6.communication + ", "+ satellite6.lifespan);
		
		Satellite satellite7 = new Satellite();
		satellite7.orbit = "geo";
		satellite7.mass = "tons";
		satellite7.power = "fuel";
		satellite7.communication = "antennas";
		satellite7.lifespan = "long";
		satellite7.toLanuch();
		System.out.println(satellite7.orbit + ", "+ satellite7.mass + ", "+ satellite7.power + ", "+ satellite7.communication + ", "+ satellite7.lifespan);
		
		Satellite satellite8 = new Satellite();
		satellite8.orbit = "meo";
		satellite8.mass = "tons";
		satellite8.power = "fuel";
		satellite8.communication = "receivers";
		satellite8.lifespan = "long";
		satellite8.toLanuch();
		System.out.println(satellite8.orbit + ", "+ satellite8.mass + ", "+ satellite8.power + ", "+ satellite8.communication + ", "+ satellite8.lifespan);
		
		Satellite satellite9 = new Satellite();
		satellite9.orbit = "geos";
		satellite9.mass = "tons";
		satellite9.power = "fuel";
		satellite9.communication = "transmitters";
		satellite9.lifespan = "long";
		satellite9.toLanuch();
		System.out.println(satellite9.orbit + ", "+ satellite9.mass + ", "+ satellite9.power + ", "+ satellite9.communication + ", "+ satellite9.lifespan);
		
		
		
		}
		}
