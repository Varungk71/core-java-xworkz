class  DoorTester{
	
public static void main(String s[]){
	
System.out.println("Creating 1st copy of Door");
Door door = new Door("VOLO", "Brass",2000, "key lock");
door.security();
System.out.println(door.Brand+ " "+door.material+ "  "+door.material+ ""+door.lockType );

System.out.println("Creating 2nd copy of Door");
Door door1 = new Door("maxon door", "wood", 2500, "smart lock");
System.out.println(door1.Brand+ " "+door1.material+ "  "+door1.material+ ""+door1.lockType );

System.out.println("Creating 3rd  copy of Door");
Door door2 = new Door("mikasa doors", "steel", 8900, "hand lock");
System.out.println(door2.Brand+ " "+door2.material+ "  "+door2.material+ ""+door2.lockType );

System.out.println("Creating 4th copy of Door");
Door door3 = new Door("pure wood doors", "glass", 9000, "electronic lock");
System.out.println(door3.Brand+ " "+door3.material+ "  "+door3.material+ ""+door3.lockType );

System.out.println("Creating 5th copy of Door");
Door door4 = new Door("doormat", "lumber", 2400, "key lock");
System.out.println(door4.Brand+ " "+door4.material+ "  "+door4.material+ ""+door4.lockType );

System.out.println("Creating 6th copy of Door");
Door door5 = new Door("shatabdi", "metal", 9800, "hand lock");
System.out.println(door5.Brand+ " "+door5.material+ "  "+door5.material+ ""+door5.lockType );

System.out.println("Creating 7th copy of Door");
Door door6 = new Door("VOLO", "iron", 5600, "key lock");
System.out.println(door6.Brand+ " "+door6.material+ "  "+door6.material+ ""+door6.lockType );

System.out.println("Creating 8th copy of Door");
Door door7 = new Door("wood doors", "fibreglass", 2800, "electronic lock");
System.out.println(door7.Brand+ " "+door7.material+ "  "+door7.material+ ""+door7.lockType );

System.out.println("Creating 9th copy of Door");
Door door8 = new Door("VOLO", "wrought iron", 2800, "phone lock");
System.out.println(door8.Brand+ " "+door8.material+ "  "+door8.material+ ""+door8.lockType );

System.out.println("Creating 10th copy of Door");
Door door9 = new Door("Greenply wooden ", "wood", 3500, "smart lock");
System.out.println(door9.Brand+ " "+door9.material+ "  "+door9.material+ ""+door9.lockType );


}

}
