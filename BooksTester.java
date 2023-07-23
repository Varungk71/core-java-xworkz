class BooksTester{
	
	
	public static void main(String s[]){															
		
		Books books = new Books("kannada text book", "story", "pragya", 300, "sangam", 100);
		System.out.println(books.name + ", "+ books.type + ", "+ books.author + ", "+ books.price + ", "+ books.publicationname + ", "+ books.numofpages);
		
		Books books1 = new Books("english", "story", "pragya", 380, "sangam", 200);
		System.out.println(books1.name + ", "+ books1.type + ", "+ books1.author + ", "+ books1.price + ", "+ books1.publicationname + ", "+ books1.numofpages);
		
		Books books2 = new Books("kannada text book", "story", "pragya",  300, "sangam", 40);
		System.out.println(books2.name + ", "+ books2.type + ", "+ books2.author + ", "+ books2.price + ", "+ books2.publicationname + ", "+ books2.numofpages);
		
		Books books3 = new Books("kannada text book", "story", "pragya", 450, "sangam", 467);
		System.out.println(books3.name + ", "+ books3.type + ", "+ books3.author + ", "+ books3.price + ", "+ books3.publicationname + ", "+ books3.numofpages);
		
		Books books4 = new Books("hindi text book", "story", "pragya", 300, "sangam", 678);
		System.out.println(books4.name + ", "+ books4.type + ", "+ books4.author + ", "+ books4.price + ", "+ books4.publicationname + ", "+ books4.numofpages);
		
		Books books5 = new Books("thamil text book", "story", "pragya", 500, "udaya", 780);
		System.out.println(books5.name + ", "+ books5.type + ", "+ books5.author + ", "+ books5.price + ", "+ books5.publicationname + ", "+ books5.numofpages);
		
		Books books6 = new Books("kannada text book", "story", "pragya", 300, "sangam", 600);
		System.out.println(books6.name + ", "+ books6.type + ", "+ books6.author + ", "+ books6.price + ", "+ books6.publicationname + ", "+ books6.numofpages);
		
		Books books7 = new Books("english book", "history", "pragya", 200, "sangam", 230);
		System.out.println(books7.name + ", "+ books7.type + ", "+ books7.author + ", "+ books7.price + ", "+ books7.publicationname + ", "+ books7.numofpages);
		
		
		
	}
}