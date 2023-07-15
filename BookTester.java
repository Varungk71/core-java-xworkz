class BookTester{

public static void main (String args[]){
	
	Book book1 = new Book();
	book1.name= "To kill a mocking bird";
	book1.type="fiction";
	book1.author= "Harper lee";
	book1.page= 336;
	book1.price=399;
	book1.publicationName = "penguin random house India";
	
	book1.gainKnowledge();
	System.out.println(book1.name+ " "+ book1.type+ " " +book1.author+ " "+book1.page+" "+book1.page+" "+book1.publicationName);
	
	
	Book book2 = new Book();
	book2.name= "The great gatsby";
	book2.type="fiction";
	book2.author= "F.Scott fitzgerald";
	book2.page= 180;
	book2.price=299;
	book2.publicationName = " Rupa publications";
	System.out.println(book2.name+ " "+ book2.type+ " " +book2.author+ " "+book2.page+" "+book2.page+" "+book2.publicationName);
	
	
	Book book3 = new Book();
	book3.name= "Sapiens: A Brief History of Humankind";
	book3.type="Non-fiction";
	book3.author= "Yuval Noah Harari";
	book3.page= 443;
	book3.price=499;
	book3.publicationName = "vintage books";
	System.out.println(book3.name+ " "+ book3.type+ " " +book3.author+ " "+book3.page+" "+book3.page+" "+book3.publicationName);
	
	Book book4 = new Book();
	book4.name= "The Alchemist";
	book4.type="fiction";
	book4.author= " Paulo Coelho";
	book4.page= 208;
	book4.price=299;
	book4.publicationName ="HarperOne"; 
	System.out.println(book4.name+ " "+ book4.type+ " " +book4.author+ " "+book4.page+" "+book4.page+" "+book4.publicationName);
	
	Book book5 = new Book();
	book5.name= "1984";
	book5.type="fiction";
	book5.author= " Paulo Coelho";
	book5.page= 328;
	book5.price=350;
	book5.publicationName = "Signet Classics";
	System.out.println(book5.name+ " "+ book5.type+ " " +book5.author+ " "+book5.page+" "+book5.page+" "+book5.publicationName);
	
	
	Book book6 = new Book();
	book6.name= "The Catcher in the Rye";
	book6.type="fiction";
	book6.author= "J.D. Salinger";
	book6.page= 224;
	book6.price=399;
	book6.publicationName = "Little, Brown and Company";
	System.out.println(book6.name+ " "+ book6.type+ " " +book6.author+ " "+book6.page+" "+book6.page+" "+book6.publicationName);
	
	
	Book book7 = new Book();
	book7.name= "The Da Vinci Code";
	book7.type="fiction";
	book7.author= "Dan Brown";
	book7.page= 592;
	book7.price=450;
	book7.publicationName = "Doubleday";
	System.out.println(book7.name+ " "+ book7.type+ " " +book7.author+ " "+book7.page+" "+book7.page+" "+book7.publicationName);	
	
	Book book8 = new Book();
	book8.name= "Harry Potter and the Philosopher's Stone";
	book8.type="fiction";
	book8.author= "J.K. Rowling";
	book8.page= 336;
	book8.price=399;
	book8.publicationName = "Bloomsbury";
	System.out.println(book8.name+ " "+ book8.type+ " " +book8.author+ " "+book8.page+" "+book8.page+" "+book8.publicationName);	
	
	
	Book book9 = new Book();
	book9.name= "Pride and Prejudice";
	book9.type="fiction";
	book9.author= "Jane Austen";
	book9.page= 432;
	book9.price=350;
	book9.publicationName = "Penguin Classics";
	System.out.println(book9.name+ " "+ book9.type+ " " +book9.author+ " "+book9.page+" "+book9.page+" "+book9.publicationName);	
	
	
	Book book10 = new Book();
	book10.name= "The Hobbit";
	book10.type="fiction";
	book10.author= "J.R.R. Tolkien";
	book10.page= 310;
	book10.price=399;
	book10.publicationName = "Houghton Mifflin Harcourt";
	System.out.println(book10.name+ " "+ book10.type+ " " +book10.author+ " "+book10.page+" "+book10.page+" "+book10.publicationName);
	}
}
