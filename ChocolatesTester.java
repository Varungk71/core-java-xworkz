class ChocolatesTester{
	
	public static void main(String test[]){
		
		Chocolates chocolates =new Chocolates("Dairy milk", "vanilla", 2, 50, "2023 dec", "2022 jan");
		System.out.println(chocolates.name + " "+ chocolates.flavour + " "+ chocolates.price + " " + chocolates.expDate + " " + chocolates.mngDate);

		Chocolates chocolates1 =new Chocolates("straberry", "fruit", 2, 50, "2023 nov", "2022 feb");
		chocolates1.toGetColories();
		System.out.println(chocolates1.name + " "+ chocolates1.flavour + " "+ chocolates1.price + " " + chocolates1.expDate + " " + chocolates1.mngDate);


		Chocolates chocolates2 =new Chocolates("milky bar", "vanilla", 6, 300, "2023 oct", "2022 march");
		chocolates2.toGetColories();
		System.out.println(chocolates2.name + " "+ chocolates2.flavour + " "+ chocolates2.price + " " + chocolates2.expDate + " " + chocolates2.mngDate);


		Chocolates chocolates3 =new Chocolates("Dairy day", "vanilla", 4, 60, "2023 sep", "2022 april");
		chocolates3.toGetColories();
		System.out.println(chocolates3.name + " "+ chocolates3.flavour + " "+ chocolates3.price + " " + chocolates3.expDate + " " + chocolates3.mngDate);


		Chocolates chocolates4 =new Chocolates("nestle", "vanilla", 2, 50, "2023 aug", "2022 may");
		chocolates4.toGetColories();
		System.out.println(chocolates4.name + " "+ chocolates4.flavour + " "+ chocolates4.price + " " + chocolates4.expDate + " " + chocolates4.mngDate);


		Chocolates chocolates5 =new Chocolates("kit kat ", "choclate", 6, 40, "2022 july", "2021 june");
		chocolates5.toGetColories();
		System.out.println(chocolates5.name + " "+ chocolates5.flavour + " "+ chocolates5.price + " " + chocolates5.expDate + " " + chocolates5.mngDate);


		Chocolates chocolates6 =new Chocolates(" amul", "vanilla", 8, 500, "2023 jun", "2022 july");
		chocolates6.toGetColories();
		System.out.println(chocolates6.name + " "+ chocolates6.flavour + " "+ chocolates6.price + " " + chocolates6.expDate + " " + chocolates6.mngDate);


		Chocolates chocolates7 =new Chocolates("snickers", "vanilla", 2, 50, "2023 may", "2022 aug");
		chocolates7.toGetColories();
		System.out.println(chocolates7.name + " "+ chocolates7.flavour + " "+ chocolates7.price + " " + chocolates7.expDate + " " + chocolates7.mngDate);


		Chocolates chocolates8 =new Chocolates("topic", "vanilla", 8, 500, "2020 april", "2000 sep");
		chocolates8.toGetColories();
		System.out.println(chocolates8.name + " "+ chocolates8.flavour + " "+ chocolates8.price + " " + chocolates8.expDate + " " + chocolates8.mngDate);


		Chocolates chocolates9 =new Chocolates("aero", "vanilla", 2, 40, "1567 march", "2005 oct");
		chocolates9.toGetColories();
		System.out.println(chocolates9.name + " "+ chocolates9.flavour + " "+ chocolates9.price + " " + chocolates9.expDate + " " + chocolates9.mngDate);



}

}
