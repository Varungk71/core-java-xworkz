class Snacks {
    String name;
    int quantity;
    String type;
	String quality;
	int price;
	
	
	public Snacks(String name, int quantity, String type, String quality, int price){
		this.name = name;
		this.quantity = quantity;
		this.type = type;
		this.quality = quality;
		this.price = price;
		
	}
    
    public void eat() {
        System.out.println("Eating " + name);
    }
}
