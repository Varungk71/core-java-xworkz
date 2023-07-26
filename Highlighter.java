class Highlighter{

	String brandName;
	String color;
	double price;
	
	public Highlighter(){
	
	System.out.println("default constructor");
	
	}
	public Highlighter(String brandName,String color){
		this(30.0);
		this.brandName=brandName;
		this.color=color;
	
	System.out.println("default constructor");
	}
	public Highlighter(double price){
		//this("cello","green");
		this.price=price;
	
	System.out.println("default constructor");

	
	}
	
}

