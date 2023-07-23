class Beverages {
    String name;
    String type;
    String category;
	String flavour;
	String form;
	
	
	
	public Beverages(String name, String type, String category, String flavour, String form){
		
		this.name = name;
		this.type = type;
		this.category = category;
		this.flavour = flavour;
		this.form = form;
		
	}
    
    public void consume() {
        System.out.println("Consuming " + name);
    }
}