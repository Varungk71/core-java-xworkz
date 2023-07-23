class MusicalTester {
    public static void main(String[] args){
		
        Musicalinstruments instrument1 = new Musicalinstruments("Guitar", "Fender", "gold", "Acoustic Lane", 50);
		System.out.println(instrument1.name + ", "+ instrument1.strings + ", "+ instrument1.material + ", "+ instrument1.shape + ", "+ instrument1.price);
       
		Musicalinstruments instrument2 = new Musicalinstruments("piano", "no", "wood", "Acoustic Lane", 4000);
		System.out.println(instrument2.name + ", "+ instrument2.strings + ", "+ instrument2.material + ", "+ instrument2.shape + ", "+ instrument2.price);	
	   
		Musicalinstruments instrument3 = new Musicalinstruments("Keyboard", "yes", "gold", "Acoustic Lane", 5000);
		System.out.println(instrument3.name + ", "+ instrument3.strings + ", "+ instrument3.material + ", "+ instrument3.shape + ", "+ instrument3.price);


		Musicalinstruments instrument4 = new Musicalinstruments("violin", "yes", "gold", "Acoustic Lane", 60000);
		System.out.println(instrument4.name + ", "+ instrument4.strings + ", "+ instrument4.material + ", "+ instrument4.shape + ", "+ instrument4.price);

		Musicalinstruments instrument5 = new Musicalinstruments("tabala", "no", "gold", "Acoustic Lane", 50000);
		System.out.println(instrument5.name + ", "+ instrument5.strings + ", "+ instrument5.material + ", "+ instrument5.shape + ", "+ instrument5.price);

		Musicalinstruments instrument6 = new Musicalinstruments("flute", "No", "gold", "Acoustic Lane", 5000000);
		System.out.println(instrument6.name + ", "+ instrument6.strings + ", "+ instrument6.material + ", "+ instrument6.shape + ", "+ instrument6.price);


		Musicalinstruments instrument7 = new Musicalinstruments("Drums", "No", "gold", "Acoustic Lane", 600000);
		System.out.println(instrument7.name + ", "+ instrument7.strings + ", "+ instrument7.material + ", "+ instrument7.shape + ", "+ instrument7.price);


		Musicalinstruments instrument8 = new Musicalinstruments("veena", "yes", "gold", "Acoustic Lane", 70000);
		System.out.println(instrument8.name + ", "+ instrument8.strings + ", "+ instrument8.material + ", "+ instrument8.shape + ", "+ instrument8.price);

		Musicalinstruments instrument9 = new Musicalinstruments("mouthorgan", "No", "gold", "Acoustic Lane", 1000);
		System.out.println(instrument9.name + ", "+ instrument9.strings + ", "+ instrument9.material + ", "+ instrument9.shape + ", "+ instrument9.price);

		Musicalinstruments instrument0 = new Musicalinstruments("saxophone", "no", "gold", "Acoustic Lane", 50);
		System.out.println(instrument0.name + ", "+ instrument0.strings + ", "+ instrument0.material + ", "+ instrument0.shape + ", "+ instrument0.price);


 }
}
