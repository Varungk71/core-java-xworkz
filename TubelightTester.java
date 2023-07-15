class TubelightTester {
    public static void main(String[] args) {
        TubeLight tubelight1 = new TubeLight();
        tubelight1.type = "LED";
        tubelight1.brand = "Philips";
        tubelight1.price = 19.99;
		tubelight1.material = "glass";
		tubelight1.voltage = "20 watts";
        tubelight1.illuminate();
		
        System.out.println("Type: " + tubelight1.type);
        System.out.println("Brand: " + tubelight1.brand);
        System.out.println("Price: $" + tubelight1.price);
		System.out.println("material: " + tubelight1.material);
        System.out.println("voltage: " + tubelight1.voltage);
        System.out.println();

        TubeLight tubelight2 = new TubeLight();
        tubelight2.type = "Fluorescent";
        tubelight2.brand = "Sylvania";
        tubelight2.price = 12.99;
		tubelight2.material = "glass";
		tubelight2.voltage = "200 watts";
        tubelight2.illuminate();
        System.out.println("Type: " + tubelight2.type);
        System.out.println("Brand: " + tubelight2.brand);
        System.out.println("Price: $" + tubelight2.price);
		System.out.println("material: " + tubelight2.material);
        System.out.println("voltage: " + tubelight2.voltage);
        System.out.println();

        TubeLight tubelight3 = new TubeLight();
        tubelight3.type = "Incandescent";
        tubelight3.brand = "GE";
        tubelight3.price = 8.99;
		tubelight3.material = "power glass";
		tubelight3.voltage = "40 watts";
        tubelight3.illuminate();
        System.out.println("Type: " + tubelight3.type);
        System.out.println("Brand: " + tubelight3.brand);
        System.out.println("Price: $" + tubelight3.price);
		System.out.println("material: " + tubelight3.material);
        System.out.println("voltage: " + tubelight3.voltage);
        System.out.println();

        TubeLight tubelight4 = new TubeLight();
        tubelight4.type = "LED";
        tubelight4.brand = "Osram";
        tubelight4.price = 14.99;
		tubelight4.material = "ateel";
		tubelight4.voltage = "28 watts";
        tubelight4.illuminate();
        System.out.println("Type: " + tubelight4.type);
        System.out.println("Brand: " + tubelight4.brand);
        System.out.println("Price: $" + tubelight4.price);
		System.out.println("material: " + tubelight4.material);
        System.out.println("voltage: " + tubelight4.voltage);
        System.out.println();

        TubeLight tubelight5 = new TubeLight();
        tubelight5.type = "Fluorescent";
        tubelight5.brand = "Feit Electric";
        tubelight5.price = 11.99;
		tubelight5.material = "transparent";
		tubelight5.voltage = "120 watts";
        tubelight5.illuminate();
        System.out.println("Type: " + tubelight5.type);
        System.out.println("Brand: " + tubelight5.brand);
        System.out.println("Price: $" + tubelight5.price);
		System.out.println("material: " + tubelight5.material);
        System.out.println("voltage: " + tubelight5.voltage);
        System.out.println();

        TubeLight tubelight6 = new TubeLight();
        tubelight6.type = "LED";
        tubelight6.brand = "Cree";
        tubelight6.price = 24.99;
		tubelight6.material = "steel";
		tubelight6.voltage = "250 watts";
        tubelight6.illuminate();
        System.out.println("Type: " + tubelight6.type);
        System.out.println("Brand: " + tubelight6.brand);
        System.out.println("Price: $" + tubelight6.price);
		System.out.println("material: " + tubelight6.material);
        System.out.println("voltage: " + tubelight6.voltage);
        System.out.println();

        TubeLight tubelight7 = new TubeLight();
        tubelight7.type = "Fluorescent";
        tubelight7.brand = "Eiko";
        tubelight7.price = 9.99;
		tubelight7.material = "glass";
		tubelight7.voltage = "20 watts";
        tubelight7.illuminate();
        System.out.println("Type: " + tubelight7.type);
        System.out.println("Brand: " + tubelight7.brand);
        System.out.println("Price: $" + tubelight7.price);
		System.out.println("material: " + tubelight7.material);
        System.out.println("voltage: " + tubelight7.voltage);
        System.out.println();

        TubeLight tubelight8 = new TubeLight();
        tubelight8.type = "LED";
        tubelight8.brand = "LIFX";
        tubelight8.price = 29.99;
		tubelight8.material = "tube glass";
		tubelight8.voltage = "670 watts";
        tubelight8.illuminate();
        System.out.println("Type: " + tubelight8.type);
        System.out.println("Brand: " + tubelight8.brand);
        System.out.println("Price: $" + tubelight8.price);
		System.out.println("material: " + tubelight8.material);
        System.out.println("voltage: " + tubelight8.voltage);
        System.out.println();

        TubeLight tubelight9 = new TubeLight();
        tubelight9.type = "Fluorescent";
        tubelight9.brand = "Halco";
        tubelight9.price = 10.99;
		tubelight9.material = "glass";
		tubelight9.voltage = "20 watts";
        tubelight9.illuminate();
        System.out.println("Type: " + tubelight9.type);
        System.out.println("Brand: " + tubelight9.brand);
        System.out.println("Price: $" + tubelight9.price);
		System.out.println("material: " + tubelight9.material);
        System.out.println("voltage: " + tubelight9.voltage);
        System.out.println();

        TubeLight tubelight10 = new TubeLight();
        tubelight10.type = "LED";
        tubelight10.brand = "Govee";
        tubelight10.price = 17.99;
		tubelight10.material = "transparent";
		tubelight10.voltage = "400 watts";
        tubelight10.illuminate();
        System.out.println("Type: " + tubelight10.type);
        System.out.println("Brand: " + tubelight10.brand);
        System.out.println("Price: $" + tubelight10.price);
		System.out.println("material: " + tubelight10.material);
        System.out.println("voltage: " + tubelight10.voltage);
        System.out.println();
    }
}
