class IceCreamTester{

	public static void main(String args[]){
	//add
	IceCream.saveflavour("venila");
	IceCream.saveflavour("chocolate");
	IceCream.saveflavour("mango");
	IceCream.saveflavour("cherry");
	IceCream.saveflavour("strawberry");
	IceCream.saveflavour("pineapple");
	IceCream.getFlavours();
	System.out.println();
	//update
	IceCream.updateFlavour("venila","Venila");
	IceCream.updateFlavour("chocolate","Chocolate");
	IceCream.updateFlavour("mango","Mango");
	IceCream.updateFlavour("cherry","Cherry");
	IceCream.updateFlavour("strawberry","Strawberry");
	IceCream.updateFlavour("pineapple","Pineapple");
	
	IceCream.getFlavours();
	System.out.println();
	//delete
	IceCream.deleteFlavour("Venila");
/*	IceCream.deleteFlavour("Chocolate");
	IceCream.deleteFlavour("Mango");
	IceCream.deleteFlavour("Cherry");
	IceCream.deleteFlavour("Strawberry");
	IceCream.deleteFlavour("Pineapple");*/
	
	System.out.println();

	IceCream.getDeletedFlavour(5);
	
	IceCream.searchFlavourByname("Chocolate");
	IceCream.searchFlavourByname("Mango");
	IceCream.searchFlavourByname("Cherry");
	IceCream.searchFlavourByname("Strawberry");
	IceCream.searchFlavourByname("Pineapple");
	}
}