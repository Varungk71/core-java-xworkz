class RocketTester{

	public static void main(String test[]){
	
		Rocket rocket = new Rocket("alpha", 1000, "us", "firefly", 2);
		System.out.println(rocket.vehicle + ", " + rocket.leo + ", " + rocket.origin + ", " + rocket.manufacture + ", " + rocket.failure);
	
		Rocket rocket1 = new Rocket("angara a5", 24000, "russia", "khrunichev", 3);
		System.out.println(rocket1.vehicle + ", " + rocket1.leo + ", " + rocket1.origin + ", " + rocket1.manufacture + ", " + rocket1.failure);
	
	
		Rocket rocket2 = new Rocket("atlas v", 18500, "us", "ula", 12);
		System.out.println(rocket2.vehicle + ", " + rocket2.leo + ", " + rocket2.origin + ", " + rocket2.manufacture + ", " + rocket2.failure);
	
		Rocket rocket3 = new Rocket("ceres 1", 28790, "china", "galactric energy", 5);
		System.out.println(rocket3.vehicle + ", " + rocket3.leo + ", " + rocket3.origin + ", " + rocket3.manufacture + ", " + rocket3.failure);
	
	
		Rocket rocket4 = new Rocket("delta", 1000, "us", "firefly", 7);
		System.out.println(rocket4.vehicle + ", " + rocket4.leo + ", " + rocket4.origin + ", " + rocket4.manufacture + ", " + rocket4.failure);
	
		Rocket rocket5 = new Rocket("angara a5", 24000, "russia", "khrunichev", 3);
		System.out.println(rocket5.vehicle + ", " + rocket5.leo + ", " + rocket5.origin + ", " + rocket5.manufacture + ", " + rocket5.failure);
	
	
		Rocket rocket6 = new Rocket("electron", 1800, "new zeland", "rocket lab", 5);
		System.out.println(rocket6.vehicle + ", " + rocket6.leo + ", " + rocket6.origin + ", " + rocket6.manufacture + ", " + rocket6.failure);
	
		Rocket rocket7 = new Rocket("gslv mk", 8000, "india", "isro", 9);
		System.out.println(rocket7.vehicle + ", " + rocket7.leo + ", " + rocket7.origin + ", " + rocket7.manufacture + ", " + rocket7.failure);
	
	
		Rocket rocket8 = new Rocket("nuri", 1470, "koria", "firefly", 3);
		System.out.println(rocket8.vehicle + ", " + rocket8.leo + ", " + rocket8.origin + ", " + rocket8.manufacture + ", " + rocket8.failure);
	
		Rocket rocket9 = new Rocket("os m1", 205, "china", "onespace", 1);
		System.out.println(rocket9.vehicle + ", " + rocket9.leo + ", " + rocket9.origin + ", " + rocket9.manufacture + ", " + rocket9.failure);
	
	
	}

}
