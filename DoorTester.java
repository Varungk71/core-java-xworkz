class  DoorTester{
	
public static void main(String s[]){
	
System.out.println("Creating 1st copy of Door");
Door door = new Door();
door.Brand= "VOLO";	
door.material = "Brass";
door.price= 6700;
door.lockType = "key lock";
door.security();
System.out.println(door.Brand+ " "+door.material+ "  "+door.material+ ""+door.lockType );

System.out.println("Creating 2nd copy of Door");
Door door1 = new Door();
door1.Brand= "maxon door";	
door1.material = "wood";
door1.price= 2500;
door1.lockType = "smart lock";
door1.security();
System.out.println(door1.Brand+ " "+door1.material+ "  "+door1.material+ ""+door1.lockType );

System.out.println("Creating 3rd  copy of Door");
Door door2 = new Door();
door2.Brand= "mikasa doors";	
door2.material = "steel";
door2.price= 8900;
door2.lockType = "hand lock";
door2.security();
System.out.println(door2.Brand+ " "+door2.material+ "  "+door2.material+ ""+door2.lockType );

System.out.println("Creating 4th copy of Door");
Door door3 = new Door();
door3.Brand= "pure wood doors";	
door3.material = "glass";
door3.price= 9000;
door3.lockType = "electronic lock";
door3.security();
System.out.println(door3.Brand+ " "+door3.material+ "  "+door3.material+ ""+door3.lockType );

System.out.println("Creating 5th copy of Door");
Door door4 = new Door();
door4.Brand= "doormat";	
door4.material = "lumber";
door4.price= 2400;
door4.lockType = "key lock";
door4.security();
System.out.println(door4.Brand+ " "+door4.material+ "  "+door4.material+ ""+door4.lockType );

System.out.println("Creating 6th copy of Door");
Door door5 = new Door();
door5.Brand= "shatabdi";	
door5.material = "metal";
door5.price= 9800;
door5.lockType = "hand lock";
door5.security();
System.out.println(door5.Brand+ " "+door5.material+ "  "+door5.material+ ""+door5.lockType );

System.out.println("Creating 7th copy of Door");
Door door6 = new Door();
door6.Brand= "VOLO";	
door6.material = "iron";
door6.price= 5600;
door6.lockType = "key lock";
door6.security();
System.out.println(door6.Brand+ " "+door6.material+ "  "+door6.material+ ""+door6.lockType );

System.out.println("Creating 8th copy of Door");
Door door7 = new Door();
door7.Brand= "wood doors";	
door7.material = "fibreglass";
door7.price= 2800;
door7.lockType = "electronic lock";
door7.security();
System.out.println(door7.Brand+ " "+door7.material+ "  "+door7.material+ ""+door7.lockType );

System.out.println("Creating 9th copy of Door");
Door door8 = new Door();
door8.Brand= "VOLO";	
door8.material = "wrought iron";
door8.price= 2800;
door8.lockType = "phone lock";
door8.security();
System.out.println(door8.Brand+ " "+door8.material+ "  "+door8.material+ ""+door8.lockType );

System.out.println("Creating 10th copy of Door");
Door door9 = new Door();
door9.Brand= "Greenply wooden ";	
door9.material = "wood";
door9.price= 3500;
door9.lockType = "smart lock";
door9.security();
System.out.println(door9.Brand+ " "+door9.material+ "  "+door9.material+ ""+door9.lockType );


}

}
