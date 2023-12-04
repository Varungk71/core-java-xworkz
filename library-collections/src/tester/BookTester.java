package tester;

import bookdto.BookDto;
import comparator.AuthorComparator;
import comparator.BookNameComparator;
import comparator.PublicationComparator;
import constant.BookType;

import java.util.*;

public class BookTester {
    public static void main(String[] args) {

       /* List<BookDto> book = new LinkedList<>();
        book.add(new BookDto(7,"jane eyre","charlotte bronte", BookType.fiction,150,"",200.0,2001));
        book.add(new BookDto(6,"To kill a mocking bird","Harper lee",BookType.biography,200,"J.B.Lippincott",300.0,1999));
        book.add(new BookDto(10,"1984","George Orwell",BookType.horror,100,"Secker & Warburg",330.0,1997));
        book.add(new BookDto(8,"The great gatsby","Scott Fitzgerald",BookType.textbook,230,"Charles Scribner's sons",200.0,1989));
        book.add(new BookDto(3,"Harry potter and sorcerer's stone","Rowling",BookType.textbook,170,"Scholastic",100.0,1992));
        book.add(new BookDto(2,"Pride and prejudice","Austen",BookType.biography,150,"Whitehall",400.0,2020));
        book.add(new BookDto(4,"The catcher in the rye","Salinger",BookType.nonFiction,300,"Little ",220.0,2000));
        book.add(new BookDto(1,"The hobbit ","Tolkien",BookType.biography,270,"Alien & Unwin",170.0,1999));
        book.add(new BookDto(5,"the hunger games","Suzanne",BookType.fiction,230,"Scholastic",160.0,2004));
        book.add(new BookDto(9,"To the light house","virginia",BookType.biography,120,"Hogarth press",220.0,2008));

        Collections.sort(book);
        System.out.println("sorting by id");
        for(BookDto book1:book)
        {
            System.out.println(book1);
        }

        Collections.sort(book,new BookNameComparator());
        System.out.println("sorting by name");
        for(BookDto book1:book)
        {
            System.out.println(book1);
        }

        Collections.sort(book,new AuthorComparator());
        System.out.println("sorting by author");
        for(BookDto book2:book)
        {
            System.out.println(book2);
        }

        Collections.sort(book,new PublicationComparator());
        System.out.println("sorting by publication");
        for(BookDto book3:book)
        {
            System.out.println(book3);
        }
        */
        Map<Integer , BookDto> map=new HashMap();

        map.put(1,new BookDto(1,"jane eyre","charlotte bronte", BookType.fiction,150,"",200.0,2001));
        map.put(2,new BookDto(2,"To kill a mocking bird","Harper lee",BookType.biography,200,"J.B.Lippincott",300.0,1999));
        map.put(3,new BookDto(3,"1984","George Orwell",BookType.horror,100,"Secker & Warburg",330.0,1997));
        map.put(4,new BookDto(4,"The great gatsby","Scott Fitzgerald",BookType.textbook,230,"Charles Scribner's sons",200.0,1989));
        map.put(5,new BookDto(5,"Harry potter and sorcerer's stone","Rowling",BookType.textbook,170,"Scholastic",100.0,1992));

        Set<Map.Entry<Integer,BookDto>>set=map.entrySet();
        for(Map.Entry<Integer,BookDto>entrySet:set)
        {
            System.out.println(entrySet.getKey() + ". " + entrySet.getValue());
        }

    }
}