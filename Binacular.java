class Binacular{
	
	String typeOfLens;
	String brandName;
	double price;
	
	public Binacular(){
	
	System.out.println("default constructor");
	}
	
	public Binacular(String typeOfLens,String brandName){
			this(10000.0);
			this.typeOfLens=typeOfLens;
			this.brandName=brandName;
	
	System.out.println("two parameter constructor");
	}
	
	public Binacular(double price){
		//this("convex","canon");
		this.price=price;
		
	
	System.out.println("one parameter constructor");
	}
}