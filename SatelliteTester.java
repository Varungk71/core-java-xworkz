class SatelliteTester{
	
	
	public static void main(String s[]){															
	 
		
		Satellite satellite = new Satellite("meo", "tons", "sunlight", "antennas", "short");
		System.out.println(satellite.orbit + ", "+ satellite.mass + ", "+ satellite.power + ", "+ satellite.communication + ", "+ satellite.lifespan);
		
		
		Satellite satellite2 = new Satellite("geo", "tons", "fuel", "antennas", "long");
		System.out.println(satellite2.orbit + ", "+ satellite2.mass + ", "+ satellite2.power + ", "+ satellite2.communication + ", "+ satellite2.lifespan);
		
		Satellite satellite3 = new Satellite("meo","tons", "fuel", "transmitters", "long");
		System.out.println(satellite3.orbit + ", "+ satellite3.mass + ", "+ satellite3.power + ", "+ satellite3.communication + ", "+ satellite3.lifespan);
		
		Satellite satellite4 = new Satellite("geo", "tons", "sunlight", "transmitters", "short");
		System.out.println(satellite4.orbit + ", "+ satellite4.mass + ", "+ satellite4.power + ", "+ satellite4.communication + ", "+ satellite4.lifespan);
		
		Satellite satellite5 = new Satellite("meo",  "tons", "sunlight", "antennas", "long");
		System.out.println(satellite5.orbit + ", "+ satellite5.mass + ", "+ satellite5.power + ", "+ satellite5.communication + ", "+ satellite5.lifespan);
		
		Satellite satellite6= new Satellite( "geo", "tons", "sunlight", "antennas", "long");
		System.out.println(satellite6.orbit + ", "+ satellite6.mass + ", "+ satellite6.power + ", "+ satellite6.communication + ", "+ satellite6.lifespan);
		
		Satellite satellite7 = new Satellite("geo", "tons", "fuel", "antennas", "long");
		System.out.println(satellite7.orbit + ", "+ satellite7.mass + ", "+ satellite7.power + ", "+ satellite7.communication + ", "+ satellite7.lifespan);
		
		Satellite satellite8 = new Satellite("meo", "tons",  "fuel", "receivers", "long");
		System.out.println(satellite8.orbit + ", "+ satellite8.mass + ", "+ satellite8.power + ", "+ satellite8.communication + ", "+ satellite8.lifespan);
		
		Satellite satellite9 = new Satellite("geos", "tons", "fuel", "transmitters", "long");
		System.out.println(satellite9.orbit + ", "+ satellite9.mass + ", "+ satellite9.power + ", "+ satellite9.communication + ", "+ satellite9.lifespan);
		
		
	}
}

			
		
		
		
		
		
		
		
		
		
		
