class Suitcase {
    String type;
    String brand;
    double price;
    String color;
    int capacity;
	
	public Suitcase(String type, String brand, double price, String color, int capacity){
		
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.capacity = capacity;
	}

    public void pack() {
        System.out.println("Suitcase packed");
    }

    public void unpack() {
        System.out.println("Suitcase unpacked");
    }
}