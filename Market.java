class Market{



static String vegetable[]={"potato","tomato","beans","onion","ginger","carrot","beetroot","cucumber","drum stick","peas"};
static String biscuits[]={"parle G","Good day","tiger","dark fantacy","sun feast","patanjali","horlicks","bounce","oreo","nutri choice"};
static String perfumes[]={"denver","signature","envy","fogg","yardley","engage","park evenue","wild stone ","nivea"};
static String groceries[]={"salt","oil","magiee","noodles","cookie","flour","sugar","ground nut"};

public static void main(String args[]){
	
	int i,j;
	
	System.out.println("vegetables are");
	
	for (i =0;i<=vegetable.length;i++)

	System.out.println((i+1) +" row =" + vegetable[i]);
	
	
	

	System.out.println("biscuits are");
	for (j =0;j<=biscuits.length;j++)


	System.out.println((j+1)+" row =" + biscuits[j]);
		


}


}