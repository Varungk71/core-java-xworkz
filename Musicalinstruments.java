 class Musicalinstruments {
    
	String name;
    String strings;
    String material;
	String shape;
	int price;
    
	
	public Musicalinstruments(String name, String strings, String material, String shape, int price){
		
		this.name = name;
		this.strings = strings;
		this.material = material;
		this.shape = shape;
		this.price = price;
	
	}

    public void music() {
        System.out.println("Intruments information are :");
    }
}
