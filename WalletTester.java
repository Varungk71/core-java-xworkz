class WalletTester {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet("Bifold", "Louis Vuitton", 500.0, "Leather", 6);
        System.out.println("Wallet 1 Details:");
        System.out.println("Type: " + wallet1.type);
        System.out.println("Brand: " + wallet1.brand);
        System.out.println("Price: $" + wallet1.price);
        System.out.println("Material: " + wallet1.material);
        System.out.println("Card Slots: " + wallet1.cardSlots);
        wallet1.storeMoney();
        wallet1.retrieveMoney();
        System.out.println();

        Wallet wallet2 = new Wallet("Trifold", "Gucci", 300.0, "Leather", 8);
        System.out.println("Wallet 2 Details:");
        System.out.println("Type: " + wallet2.type);
        System.out.println("Brand: " + wallet2.brand);
        System.out.println("Price: $" + wallet2.price);
        System.out.println("Material: " + wallet2.material);
        System.out.println("Card Slots: " + wallet2.cardSlots);
        wallet2.storeMoney();
        wallet2.retrieveMoney();
        System.out.println();

        Wallet wallet3 = new Wallet("Slim", "Prada", 400.0, "Leather", 4);
        System.out.println("Wallet 3 Details:");
        System.out.println("Type: " + wallet3.type);
        System.out.println("Brand: " + wallet3.brand);
        System.out.println("Price: $" + wallet3.price);
        System.out.println("Material: " + wallet3.material);
        System.out.println("Card Slots: " + wallet3.cardSlots);
        wallet3.storeMoney();
        wallet3.retrieveMoney();
        System.out.println();

        Wallet wallet4 = new Wallet("Money Clip", "Montblanc", 250.0, "Leather", 2);
        System.out.println("Wallet 4 Details:");
        System.out.println("Type: " + wallet4.type);
        System.out.println("Brand: " + wallet4.brand);
        System.out.println("Price: $" + wallet4.price);
        System.out.println("Material: " + wallet4.material);
        System.out.println("Card Slots: " + wallet4.cardSlots);
        wallet4.storeMoney();
        wallet4.retrieveMoney();
        System.out.println();

        Wallet wallet5 = new Wallet("Card Holder", "Hermes", 600.0, "Leather", 12);
        System.out.println("Wallet 5 Details:");
        System.out.println("Type: " + wallet5.type);
        System.out.println("Brand: " + wallet5.brand);
        System.out.println("Price: $" + wallet5.price);
        System.out.println("Material: " + wallet5.material);
        System.out.println("Card Slots: " + wallet5.cardSlots);
        wallet5.storeMoney();
        wallet5.retrieveMoney();
        System.out.println();

        Wallet wallet6 = new Wallet("Bifold", "Coach", 150.0, "Leather", 4);
        System.out.println("Wallet 6 Details:");
        System.out.println("Type: " + wallet6.type);
        System.out.println("Brand: " + wallet6.brand);
        System.out.println("Price: $" + wallet6.price);
        System.out.println("Material: " + wallet6.material);
        System.out.println("Card Slots: " + wallet6.cardSlots);
        wallet6.storeMoney();
        wallet6.retrieveMoney();
        System.out.println();

        Wallet wallet7 = new Wallet("Trifold", "Fossil", 80.0, "Leather", 6);
        System.out.println("Wallet 7 Details:");
        System.out.println("Type: " + wallet7.type);
        System.out.println("Brand: " + wallet7.brand);
        System.out.println("Price: $" + wallet7.price);
        System.out.println("Material: " + wallet7.material);
        System.out.println("Card Slots: " + wallet7.cardSlots);
        wallet7.storeMoney();
        wallet7.retrieveMoney();
        System.out.println();

        Wallet wallet8 = new Wallet("Slim", "Michael Kors", 200.0,  "Leather", 6);
        System.out.println("Wallet 8 Details:");
        System.out.println("Type: " + wallet8.type);
        System.out.println("Brand: " + wallet8.brand);
        System.out.println("Price: $" + wallet8.price);
        System.out.println("Material: " + wallet8.material);
        System.out.println("Card Slots: " + wallet8.cardSlots);
        wallet8.storeMoney();
        wallet8.retrieveMoney();
        System.out.println();

        Wallet wallet9 = new Wallet("Money Clip", "Calvin Klein", 100.0, "leather", 2);
        System.out.println("Wallet 9 Details:");
        System.out.println("Type: " + wallet9.type);
        System.out.println("Brand: " + wallet9.brand);
        System.out.println("Price: $" + wallet9.price);
        System.out.println("Material: " + wallet9.material);
        System.out.println("Card Slots: " + wallet9.cardSlots);
        wallet9.storeMoney();
        wallet9.retrieveMoney();
        System.out.println();

        Wallet wallet10 = new Wallet("Card Holder", "Kate Spade", 120.0, "leather", 8);

        System.out.println("Wallet 10 Details:");
        System.out.println("Type: " + wallet10.type);
        System.out.println("Brand: " + wallet10.brand);
        System.out.println("Price: $" + wallet10.price);
        System.out.println("Material: " + wallet10.material);
        System.out.println("Card Slots: " + wallet10.cardSlots);
        wallet10.storeMoney();
        wallet10.retrieveMoney();
        System.out.println();
    }
}

