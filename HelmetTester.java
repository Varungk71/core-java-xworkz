class HelmetTester{
	
	
	public static void main(String s[]){															
	 
		Helmet helmet = new Helmet("lazer", "22-25mm", "good quality foam", "1.2kg", 500);
		System.out.println(helmet.brandname + ", "+ helmet.thickness + ", "+ helmet.quality + ", "+ helmet.weight + ", "+ helmet.price);
	
		Helmet helmet1 = new Helmet("Aral", "22-25mm", "good quality foam", "1.2kg", 600);
		System.out.println(helmet1.brandname + ", "+ helmet1.thickness + ", "+ helmet1.quality + ", "+ helmet1.weight + ", "+ helmet1.price);

		Helmet helmet2 = new Helmet("Thh", "22-25mm", "good quality foam", "1.2kg", 500);
		System.out.println(helmet2.brandname + ", "+ helmet2.thickness + ", "+ helmet2.quality + ", "+ helmet2.weight + ", "+ helmet2.price);

		Helmet helmet3 = new Helmet("Steelbird", "22-25mm", "good quality foam", "1.2kg", 700);
		System.out.println(helmet3.brandname + ", "+ helmet3.thickness + ", "+ helmet3.quality + ", "+ helmet3.weight + ", "+ helmet3.price);
	
		Helmet helmet4 = new Helmet("Studds", "22-25mm", "good quality foam", "1.2kg", 400);
		System.out.println(helmet4.brandname + ", "+ helmet4.thickness + ", "+ helmet4.quality + ", "+ helmet4.weight + ", "+ helmet4.price);
	
		Helmet helmet5 = new Helmet("HJC", "22-25mm", "good quality foam", "1.2kg", 450);
		System.out.println(helmet5.brandname + ", "+ helmet5.thickness + ", "+ helmet5.quality + ", "+ helmet5.weight + ", "+ helmet5.price);
	
		Helmet helmet6 = new Helmet("vega", "22-25mm", "good quality foam", "1.2kg", 550);
		System.out.println(helmet6.brandname + ", "+ helmet6.thickness + ", "+ helmet6.quality + ", "+ helmet6.weight + ", "+ helmet6.price);
	
	
		Helmet helmet7 = new Helmet("Bell", "22-25mm", "good quality foam", "1.2kg", 5000);
		System.out.println(helmet7.brandname + ", "+ helmet7.thickness + ", "+ helmet7.quality + ", "+ helmet7.weight + ", "+ helmet7.price);
	
	
		Helmet helmet8 = new Helmet("Royal Enfeild", "22-25mm", "good quality foam", "1.2kg", 1000);
		System.out.println(helmet.brandname + ", "+ helmet.thickness + ", "+ helmet.quality + ", "+ helmet.weight + ", "+ helmet.price);
	
	
		Helmet helmet9 = new Helmet("agv", "22-25mm", "good quality foam", "1.2kg", 100);
		System.out.println(helmet9.brandname + ", "+ helmet9.thickness + ", "+ helmet9.quality + ", "+ helmet9.weight + ", "+ helmet9.price);
	
		Helmet helmet0 = new Helmet("Bell Sports", "22-25mm", "good quality foam", "1.2kg", 900);
		System.out.println(helmet0.brandname + ", "+ helmet0.thickness + ", "+ helmet0.quality + ", "+ helmet0.weight + ", "+ helmet0.price);
	}
}
