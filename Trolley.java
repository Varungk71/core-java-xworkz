class Trolley {
    String type;
    String brand;
    double price;
    int capacity;
	int width;
	
	
	public Trolley(String type, String brand, double price, int capacity, int width){
		
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
		this.width = width;
	}

    public void roll() {
        System.out.println("Trolley rolling");
    }

    public void stop() {
        System.out.println("Trolley stopped");
    }
}