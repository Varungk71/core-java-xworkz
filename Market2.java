class Market2{



//static String vegetable[]={"potato","tomato","beans","onion","ginger","carrot","beetroot","cucumber","drum stick","peas"};
static String biscuit[]={"parle G","Good day","tiger","dark fantacy","sun feast","patanjali","horlicks","bounce","oreo","nutri choice"};
static String perfume[]={"denver","signature","envy","fogg","yardley","engage","park evenue","wild stone ","nivea"};
static String grocerie[]={"salt","oil","magiee","noodles","cookie","flour","sugar","ground nut"};

public static void main(String args[]){
	String vegetable[]={"potato","tomato","beans","onion","ginger","carrot","beetroot","cucumber","drum stick","peas"};

	
	getVegetables();
	getBiscuits();
	getPerfumes();
	getgroceries();
	}

	
	public static void getVegetables(){
		
	
		for(String vegetables : vegetable)
		
		System.out.println(vegetables);
		System.out.println("------------");
		
	}
	public static void getBiscuits(){
	
		for(String biscuits : biscuit)
		
		System.out.println(biscuits);
		System.out.println("------------");
	}
	public static void getPerfumes(){
	
		for(String perfumes : perfume)
		
		System.out.println(perfumes);
		System.out.println("------------");
	}
	public static void getgroceries(){
	
		for(String groceries : grocerie)
		
		System.out.println(groceries);
		System.out.println("---------------------");
	}
}