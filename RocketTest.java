class RocketTest{

	public static void main(String test[]){
	
		Rocket rocket = new Rocket();
		rocket.vehicle = "alpha";
		rocket.leo = 1000;
		rocket.origin = "us";
		rocket.manufacture = "firefly";
		rocket.failure = 2;
		rocket.currentRockets();
		System.out.println(rocket.vehicle + ", " + rocket.leo + ", " + rocket.origin + ", " + rocket.manufacture + ", " + rocket.failure);
	
		Rocket rocket1 = new Rocket();
		rocket1.vehicle = "angara a5";
		rocket1.leo = 24000;
		rocket1.origin = "russia";
		rocket1.manufacture = "khrunichev";
		rocket1.failure = 3;
		rocket1.currentRockets();
		System.out.println(rocket1.vehicle + ", " + rocket1.leo + ", " + rocket1.origin + ", " + rocket1.manufacture + ", " + rocket1.failure);
	
	
		Rocket rocket2 = new Rocket();
		rocket2.vehicle = "atlas v";
		rocket2.leo = 18500;
		rocket2.origin = "us";
		rocket2.manufacture = "ula";
		rocket2.failure = 12;
		rocket2.currentRockets();
		System.out.println(rocket2.vehicle + ", " + rocket2.leo + ", " + rocket2.origin + ", " + rocket2.manufacture + ", " + rocket2.failure);
	
		Rocket rocket3 = new Rocket();
		rocket3.vehicle = "ceres 1";
		rocket3.leo = 28790;
		rocket3.origin = "china";
		rocket3.manufacture = "galactric energy";
		rocket3.failure = 5;
		rocket3.currentRockets();
		System.out.println(rocket3.vehicle + ", " + rocket3.leo + ", " + rocket3.origin + ", " + rocket3.manufacture + ", " + rocket3.failure);
	
	
		Rocket rocket4 = new Rocket();
		rocket4.vehicle = "delta";
		rocket4.leo = 1000;
		rocket4.origin = "us";
		rocket4.manufacture = "firefly";
		rocket4.failure = 7;
		rocket4.currentRockets();
		System.out.println(rocket4.vehicle + ", " + rocket4.leo + ", " + rocket4.origin + ", " + rocket4.manufacture + ", " + rocket4.failure);
	
		Rocket rocket5 = new Rocket();
		rocket5.vehicle = "angara a5";
		rocket5.leo = 24000;
		rocket5.origin = "russia";
		rocket5.manufacture = "khrunichev";
		rocket5.failure = 3;
		rocket5.currentRockets();
		System.out.println(rocket5.vehicle + ", " + rocket5.leo + ", " + rocket5.origin + ", " + rocket5.manufacture + ", " + rocket5.failure);
	
	
		Rocket rocket6 = new Rocket();
		rocket6.vehicle = "electron";
		rocket6.leo = 1800;
		rocket6.origin = "new zeland";
		rocket6.manufacture = "rocket lab";
		rocket6.failure = 5;
		rocket6.currentRockets();
		System.out.println(rocket6.vehicle + ", " + rocket6.leo + ", " + rocket6.origin + ", " + rocket6.manufacture + ", " + rocket6.failure);
	
		Rocket rocket7 = new Rocket();
		rocket7.vehicle = "gslv mk";
		rocket7.leo = 8000;
		rocket7.origin = "india";
		rocket7.manufacture = "isro";
		rocket7.failure = 9;
		rocket7.currentRockets();
		System.out.println(rocket7.vehicle + ", " + rocket7.leo + ", " + rocket7.origin + ", " + rocket7.manufacture + ", " + rocket7.failure);
	
	
		Rocket rocket8 = new Rocket();
		rocket8.vehicle = "nuri";
		rocket8.leo = 1470;
		rocket8.origin = "koria";
		rocket8.manufacture = "firefly";
		rocket8.failure = 3;
		rocket8.currentRockets();
		System.out.println(rocket8.vehicle + ", " + rocket8.leo + ", " + rocket8.origin + ", " + rocket8.manufacture + ", " + rocket8.failure);
	
		Rocket rocket9 = new Rocket();
		rocket9.vehicle = "os m1";
		rocket9.leo = 205;
		rocket9.origin = "china";
		rocket9.manufacture = "onespace";
		rocket9.failure = 1;
		rocket9.currentRockets();
		System.out.println(rocket9.vehicle + ", " + rocket9.leo + ", " + rocket9.origin + ", " + rocket9.manufacture + ", " + rocket9.failure);
	
	
	}

}
