class BarTester {
    public static void main(String[] args) {
        Bar bar1 = new Bar();
        bar1.name = "Cheers Bar";
        bar1.ageLimit = 21;
        bar1.type = "Pub";
		bar1.location = "mandya";
		bar1.service = "selfservice";
		bar1.damagePeople();
        System.out.println("Bar 1 Details:");
        System.out.println(bar1.name + ", " + bar1.ageLimit + ", " +bar1.type + ", " + bar1.location + ", " + bar1.service);
        System.out.println();
		
        Bar bar2 = new Bar();
        bar2.name = "Mojito Lounge";
        bar2.ageLimit = 18;
        bar2.type = "Cocktail Bar";
		bar2.location = "maddur";
		bar2.service = "wellservice";
		bar2.damagePeople();
        System.out.println("Bar 2 Details:");
        System.out.println(bar2.name + ", " + bar2.ageLimit + ", " + bar2.type + ", " + bar2.location + ", " + bar2.service);
        System.out.println();

        Bar bar3 = new Bar();
        bar3.name = "Whiskey Tavern";
        bar3.ageLimit = 25;
        bar3.type = "Whiskey Bar";
		bar3.location = "cpn";
		bar3.service = "service";
		bar3.damagePeople();
        System.out.println("Bar 3 Details:");
        System.out.println(bar3.name + ", " + bar3.ageLimit + ", " + bar3.type + ", " + bar3.location + ", " + bar3.service);
        System.out.println();

        Bar bar4 = new Bar();
        bar4.name = "Brews and Bites";
        bar4.ageLimit = 21;
        bar4.type = "Microbrewery";
		bar4.location = "ramnagar";
		bar4.service = "slow service";
		bar4.damagePeople();
        System.out.println("Bar 4 Details:");
        System.out.println(bar4.name + ", " + bar4.ageLimit + ", " + bar4.type + ", " + bar4.location + ", " + bar4.service);
        System.out.println();

        Bar bar5 = new Bar();
        bar5.name = "Dive Bar";
        bar5.ageLimit = 21;
        bar5.type = "Neighborhood Bar";
		bar5.location = "bidadi";
		bar5.service = "table service";
		bar5.damagePeople();
        System.out.println("Bar 5 Details:");
        System.out.println(bar5.name + ", " + bar5.ageLimit + ", " + bar5.type + ", " + bar5.location + ", " + bar5.service);
        System.out.println();

        Bar bar6 = new Bar();
        bar6.name = "Tiki Hut";
        bar6.ageLimit = 21;
        bar6.type = "Beach Bar";
		bar6.location = "kengeri";
		bar6.service = "urgent service";
		bar6.damagePeople();
        System.out.println("Bar 6 Details:");
        System.out.println(bar6.name + ", " + bar6.ageLimit + ", " + bar6.type + ", " + bar6.location + ", " + bar6.service);
        System.out.println();

        Bar bar7 = new Bar();
        bar7.name = "Rooftop Lounge";
        bar7.ageLimit = 21;
        bar7.type = "Outdoor Bar";
		bar7.location = "satellite";
		bar7.service = "self service";
		bar7.damagePeople();

        System.out.println("Bar 7 Details:");
        System.out.println(bar7.name + ", " + bar7.ageLimit + ", " + bar7.type + ", " + bar7.location + ", " + bar7.service);
        System.out.println();

        Bar bar8 = new Bar();
        bar8.name = "Sports Bar";
        bar8.ageLimit = 21;
        bar8.type = "Sports Bar";
		bar8.location = "rajajinagar";
		bar8.service = "well service";
		bar8.damagePeople();
        System.out.println("Bar 8 Details:");
        System.out.println(bar8.name + ", " + bar8.ageLimit + ", " + bar8.type + ", " + bar8.location + ", " + bar8.service);
        System.out.println();

        Bar bar9 = new Bar();
        bar9.name = "Wine Bar";
        bar9.ageLimit = 21;
        bar9.type = "Wine Bar";
		bar9.location = "rr nagar";
		bar9.service = "urgentservice";
		bar9.damagePeople();

        System.out.println("Bar 9 Details:");
        System.out.println(bar9.name + ", " + bar9.ageLimit + ", " + bar9.type + ", " + bar9.location + ", " + bar9.service);
        System.out.println();

        Bar bar10 = new Bar();
        bar10.name = "Irish Pub";
        bar10.ageLimit = 21;
        bar10.type = "Irish Pub";
		bar10.location = "kr market";
		bar10.service = "self service";
		bar10.damagePeople();
        System.out.println("Bar 10 Details:");
        System.out.println(bar10.name + ", " +bar10.ageLimit + ", " + bar10.type + ", " + bar10.location + ", " + bar10.service);
        System.out.println();
    }
}
