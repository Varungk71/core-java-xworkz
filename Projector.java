class Projector {
    String brand;
    String model;
    double price;
	
	
	public Projector(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}

    public void display() {
        System.out.println("Displaying with " + brand + " projector");
    }
}
