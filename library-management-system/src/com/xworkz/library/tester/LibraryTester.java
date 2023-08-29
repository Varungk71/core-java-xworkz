package com.xworkz.library.tester;

import com.xworkz.library.abstraction.Library;
import com.xworkz.library.constant.BookType;
import com.xworkz.library.dto.BookDTO;
import com.xworkz.library.impl.CentralLibraryImpl;

import java.util.Scanner;

public class LibraryTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the book size");
        int size = sc.nextInt();
        Library lib = new CentralLibraryImpl(size);
        for (int index = 0; index < size; index++) {
            BookDTO book = new BookDTO();
            System.out.println("enter the book name ");
            book.setBookName(sc.next());
            System.out.println("enter the book author ");
            book.setBookAuthor(sc.next());
            System.out.println("enter the book type");
            book.setType(BookType.valueOf(sc.next()));
            System.out.println("enter the number of pages ");
            book.setNoOfPage(sc.nextInt());
            System.out.println("enter the book publication ");
            book.setPublication(sc.next());
            System.out.println("enter the book price ");
            book.setPrice(sc.nextInt());
            System.out.println("enter the book published year ");
            book.setPublishedYear(sc.nextInt());

            lib.addBook(book);
        }


        String userInput = null;

        do{
            System.out.println("press 1. to get book details");
            System.out.println("press 2. to get book name by id");
            System.out.println("press 3. to get book name by year");
            System.out.println("press 4. to get book name by author");
            System.out.println("press 5. to get book name by publication");
            System.out.println("press 6. to get book name by type");
            System.out.println("press 7. to get book price by name");
            System.out.println("press 8. to get name by year");
            System.out.println("press 9. to update book page");
            System.out.println("press 10. to update book price");
            System.out.println("press 11. to update publisher ");
            System.out.println("press 12. to delete book");




            int option=sc.nextInt();
            switch(option){
                case 1:
                    lib.getAllBooks();
                    break;
                case 2:
                    System.out.println("enter book id to get book name");
                    String name=lib.getBookNameByBookid(sc.nextInt());
                    System.out.println("the book name is "+ name);
                    break;
                case 3:
                    System.out.println("enter published year");
                    BookDTO[] bookName=lib.getBookByYear(sc.nextInt());
                    System.out.println("the book name is " + bookName);
                    break;
                case 4:
                    System.out.println("enter book author name");
                    BookDTO[] book2=lib.getBookByBookAuthor(sc.next());
                    System.out.println("books are "+ book2);
                    break;
                case 5:
                    System.out.println("enter publication name");
                    BookDTO book1=lib.getBookByBookPublication(sc.next());
                    System.out.println("book name is "+ book1);
                    break;
                case 6:
                    System.out.println("enter book type");
                    String name2= String.valueOf(lib.getBooknameByBookType(BookType.valueOf(sc.next())));
                    System.out.println("book name is "+ name2);
                    break;
                case 7:
                    System.out.println("enter book name");
                    double price=lib.getBookPriceByBookName(sc.next());
                    System.out.println("book price is " + price);
                    break;
                case 8:
                    System.out.println("enter book published year");
                    String name3=lib.getBooknameByYearOfPublication(sc.nextInt());
                    System.out.println("book name is " + name3);
                    break;
                case 9:
                    System.out.println("enter book id");
                    boolean updatePage=lib.updateBookPageByBookId(sc.nextInt(),sc.nextInt());
                    System.out.println("is page updated "+ updatePage);
                    break;
                case 10:
                    System.out.println("enter the book id");
                    boolean updatePrice=lib.updateBookPriceByBookId(sc.nextInt(),sc.nextInt());
                    System.out.println("is price updated "+ updatePrice);
                    break;

                case 11:
                    System.out.println("enter book author");
                    boolean updatePublication= lib.updatePublisherByAuthor(sc.next(),sc.next());
                    System.out.println("is publication updated "+ updatePublication);
                    break;
                case 12:
                    System.out.println("enter the book id");
                    boolean deleteBook=lib.deleteBookByBookId(sc.nextInt());
                    System.out.println("is book deleted "+deleteBook);
                    break;

            }
            System.out.println("do you want to continue (yes/no)");
            userInput=sc.next();
        }while (userInput.equals("yes"));
        System.out.println("thank you ...");
    }

}
