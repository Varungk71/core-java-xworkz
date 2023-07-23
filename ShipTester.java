class ShipTester{

	public static void main(String test[]){
	
		Ship ship = new Ship("rv john.martin", "56ft", "1300hp", 5000, "25kts");
		System.out.println("the ship details are: ");
		System.out.println(ship.name + ", " + ship.length + ", " + ship.horsepower + ", " + ship.capacity + ", " + ship.speed);
	
		Ship ship1 = new Ship("rv sheila b", "30ft", "300hp", 250, "20kts");
		System.out.println("the ship1 details are: ");
		System.out.println(ship1.name + ", " + ship1.length + ", " + ship1.horsepower + ", " + ship1.capacity + ", " + ship1.speed);
	
		Ship ship2 = new Ship("terry fox", "80ft", "8900hp", 7800, "50kts");
		System.out.println("the ship2 details are: ");
		System.out.println(ship2.name + ", " + ship2.length + ", " + ship2.horsepower + ", " + ship2.capacity + ", " + ship2.speed);
	
		Ship ship3 = new Ship("healy", "56ft", "1300hp", 300, "15kts");
		System.out.println("the ship3 details are: ");
		System.out.println(ship3.name + ", " + ship3.length + ", " + ship3.horsepower + ", " + ship3.capacity + ", " + ship3.speed);
	
		Ship ship4 = new Ship("korian rv", "89ft", "1300hp", 8000, "85kts");
		System.out.println("the ship4 details are: ");
		System.out.println(ship4.name + ", " + ship4.length + ", " + ship4.horsepower + ", " + ship4.capacity + ", " + ship4.speed);
	
		Ship ship5 = new Ship("titanic", "16800ft", "78960hp", 1789065, "890kts");
		System.out.println("the ship5 details are: ");
		System.out.println(ship5.name + ", " + ship5.length + ", " + ship5.horsepower + ", " + ship5.capacity + ", " + ship5.speed);
	
		Ship ship6 = new Ship("victory", "56ft", "1300hp", 5600, "25kts");
		System.out.println("the ship6 details are: ");
		System.out.println(ship6.name + ", " + ship6.length + ", " + ship6.horsepower + ", " + ship6.capacity + ", " + ship6.speed);
	
		Ship ship7 = new Ship("queen mary 2", "160ft", "1300hp", 5678, "670kts");
		System.out.println("the ship7 details are: ");
		System.out.println(ship7.name + ", " + ship7.length + ", " + ship7.horsepower + ", " + ship7.capacity + ", " + ship7.speed);
	
		
		Ship ship8 = new Ship("liberty of seas", "56ft", "1300hp", 7800, "5kts");
		System.out.println("the ship8 details are: ");
		System.out.println(ship8.name + ", " + ship8.length + ", " + ship8.horsepower + ", " + ship8.capacity + ", " + ship8.speed);
	
		Ship ship9 = new Ship("ms achille lauro", "56ft", "1300hp", 5600, "25kts");
		System.out.println("the ship9 details are: ");
		System.out.println(ship9.name + ", " + ship9.length + ", " + ship9.horsepower + ", " + ship9.capacity + ", " + ship9.speed);
		
	}

}

