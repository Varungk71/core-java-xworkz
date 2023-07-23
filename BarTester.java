class BarTester {
    public static void main(String[] args) {
       
	    Bar bar1 = new Bar("Cheers Bar",21,"pub","mandya","selfservice");
		System.out.println(bar1.name + ", " + bar1.ageLimit + ", " +bar1.type + ", " + bar1.location + ", " + bar1.service);

		Bar bar2 = new Bar("Mojito Lounge",18,"Cocktail Bar","maddur","wellservice");
		System.out.println(bar2.name + ", " + bar2.ageLimit + ", " + bar2.type + ", " + bar2.location + ", " + bar2.service);

        Bar bar3 = new Bar("Whiskey Tavern",25,"Whiskey Bar","cpn","service");
		System.out.println(bar3.name + ", " + bar3.ageLimit + ", " + bar3.type + ", " + bar3.location + ", " + bar3.service);
		
		Bar bar4 = new Bar("Brews and Bites",21,"Microbrewery","ramnagar","slow service");
		System.out.println(bar4.name + ", " + bar4.ageLimit + ", " + bar4.type + ", " + bar4.location + ", " + bar4.service);

		Bar bar5 = new Bar("Dive Bar",21,"Neighborhood Bar","bidadi","table service");
		System.out.println(bar5.name + ", " + bar5.ageLimit + ", " + bar5.type + ", " + bar5.location + ", " + bar5.service);


	}
	}