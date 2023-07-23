public class ToysTester {
    
	public static void main(String[] args) {
        Toys toy1 = new Toys("Action Figure", "Action Figure", 29, "Red", "yes");
        System.out.println(toy1.name + ", "+ toy1.type + ", "+ toy1.price + ", "+ toy1.color + ", "+ toy1.safe);
		toy1.play();

        Toys toy2 = new Toys("LEGO Set", "Building Blocks", 49, "Multi-color",  "yes");
		System.out.println(toy2.name + ", "+ toy2.type + ", "+ toy2.price + ", "+ toy2.color + ", "+ toy2.safe);
        toy2.play();

        Toys toy3 = new Toys("Doll", "Fashion Doll", 19, "Pink", "yes");
		System.out.println(toy3.name + ", "+ toy3.type + ", "+ toy3.price + ", "+ toy3.color + ", "+ toy3.safe);
        toy3.play();

        Toys toy4 = new Toys("Board Game", "Strategy Game", 24, "Multi-color", "yes");
		System.out.println(toy4.name + ", "+ toy4.type + ", "+ toy4.price + ", "+ toy4.color + ", "+ toy4.safe);
        toy4.play();

        Toys toy5 = new Toys("Remote Control Car", "RC Car", 39, "Blue", "yes");
		System.out.println(toy5.name + ", "+ toy5.type + ", "+ toy5.price + ", "+ toy5.color + ", "+ toy5.safe);
        toy5.play();

        Toys toy6 = new Toys("Puzzle", "Jigsaw Puzzle", 14, "Multi-color", "yes");
		System.out.println(toy6.name + ", "+ toy6.type + ", "+ toy6.price + ", "+ toy6.color + ", "+ toy6.safe);
        toy6.play();

        Toys toy7 = new Toys("Stuffed Animal", "Plush Toy", 9, "Brown", "yes");
		System.out.println(toy7.name + ", "+ toy7.type + ", "+ toy7.price + ", "+ toy7.color + ", "+ toy7.safe);
        toy7.play();

        Toys toy8 = new Toys("Art Set", "Drawing Kit", 19, "Multi-color", "yes");
		System.out.println(toy8.name + ", "+ toy8.type + ", "+ toy8.price + ", "+ toy8.color + ", "+ toy8.safe);
        toy8.play();

        Toys toy9 = new Toys("RC Drone", "Quadcopter", 79, "Black", "yes");
		System.out.println(toy9.name + ", "+ toy9.type + ", "+ toy9.price + ", "+ toy9.color + ", "+ toy9.safe);
        toy9.play();

        Toys toy10 = new Toys("Building Set", "Construction Toy", 34, "Yellow", "yes");
		System.out.println(toy10.name + ", "+ toy10.type + ", "+ toy10.price + ", "+ toy10.color + ", "+ toy10.safe);
        toy10.play();
    }
}

