class Wallet{
    String type;
    String brand;
    double price;
    String material;
    int cardSlots;
	
	
	public Wallet(String type, String brand, double price, String material, int cardSlots){
		
		this.type=type;
		this.brand=brand;
		this.price=price;
		this.material=material;
		this.cardSlots=cardSlots;
	}

    public void storeMoney() {
        System.out.println("Money stored in wallet");
    }

    public void retrieveMoney() {
        System.out.println("Money retrieved from wallet");
    }
}
