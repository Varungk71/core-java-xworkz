package com.xworkz.library.impl;

import com.xworkz.library.abstraction.Library;
import com.xworkz.library.constant.BookType;
import com.xworkz.library.dto.BookDTO;
import com.xworkz.library.exception.BookNotFoundException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter
@Getter
@ToString



public class CentralLibraryImpl implements Library {
    public BookDTO[] book;
    int index;
    int id = 0;

    public CentralLibraryImpl(int size)
    {
        book = new BookDTO[size];
    }


    @Override
    public boolean addBook(BookDTO book) {
        boolean isAdded = false;
        if (book != null) {
            book.setBookId(++id);
            this.book[index++] = book;
        } else {
            System.out.println("book is null..");

        }
        return isAdded = true;
    }

    @Override
    public void getAllBooks() {
        for (int bookIndex = 0; bookIndex < book.length; bookIndex++) {
            System.out.println("the book details are ");
            System.out.println(book[bookIndex]);
        }
    }

    @Override
    public String getBookNameByBookid(int bookId) throws BookNotFoundException {
        String bookName = null;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookId() == bookId) {
                bookName = book[index].getBookName();
            }

        }
        if (bookName==null)
        {
            BookNotFoundException bookNotFoundException=new BookNotFoundException("book not found for entered book id");
            throw bookNotFoundException;
        }
        return bookName;
    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublication) {
        BookDTO[] newBook = null;
        int newIndex = 0;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getPublishedYear() == yearOfPublication) {
                newIndex++;
            }
        }
        newBook = new BookDTO[newIndex];
        newIndex = 0;
        for (int index = 0; index < newBook.length; index++) {
            if (book[index].getPublishedYear() == yearOfPublication) {
                newBook[newIndex++] = this.book[index];
            }
        }
        return newBook;
    }

    @Override
    public BookDTO[] getBookByBookAuthor(String author) {
        BookDTO[] authorBook = null;
        int newIndex = 0;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookAuthor().equals(author)) {
                newIndex++;
            }
        }
        authorBook = new BookDTO[newIndex];
        newIndex = 0;
        for (int index = 0; index < authorBook.length; index++) {
            if (book[index].getBookAuthor().equals(author)) {
                authorBook[newIndex++] = book[index];
            }
            System.out.println(authorBook);
        }
        return authorBook;
    }

    @Override
    public BookDTO getBookByBookPublication(String publication) {
        String publicationName;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getPublication().equals(publication)) {
                publicationName = book[index].getPublication();
            }
        }
        return null;
    }

    @Override
    public String getBooknameByBookType(BookType type) {
        String bookName = null;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getType().equals(type)) {
                bookName = book[index].getBookName();
            }
        }
        return bookName;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double bookPrice = 0;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookName().equals(bookName)) {
                bookPrice = book[index].getPrice();
            }
        }

        return bookPrice;
    }

    @Override
    public String[] getBooknameByYearOfPublication(int yearOfpublish) {
        String[] bookName = null;
        int newIndex = 0;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getPublishedYear() == yearOfpublish) {


                newIndex++;
            }
        }
        bookName = new String[newIndex];
        for (int index = 0; index < bookName.length; index++) {
            if (book[index].getPublishedYear() == yearOfpublish) {
                bookName[newIndex++] = this.book[index].getBookName();
            }
            System.out.println(bookName);
        }


        return bookName;
    }

    @Override
    public boolean updateBookPageByBookId(int updatedPage, int bookId) {
        boolean isPageUpdated = false;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookId() == bookId) {
                book[index].setNoOfPage(updatedPage);
                isPageUpdated = true;
            }

        }
        return isPageUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int updatedPrice, int bookId) {
        boolean isPriceUpdated = false;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookId() == bookId) {
                book[index].setPrice(updatedPrice);
                isPriceUpdated = true;
            }

        }
        return isPriceUpdated;
    }

    @Override
    public boolean updatePublisherByAuthor(String updatedPublisher, String existingAuthor) {
        boolean isPublicationUpdated = false;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookAuthor().equals(existingAuthor)) {
                book[index].setPublication(updatedPublisher);
                isPublicationUpdated = true;
            }
        }
        return isPublicationUpdated;
    }

    @Override
    public boolean deleteBookByBookId(int bookId) {
        boolean isDeleted = false;
        int newIndex, oldIndex;
        for (oldIndex = 0, newIndex = 0; oldIndex < book.length; oldIndex++) {
            if (!(book[oldIndex].getBookId() == bookId)) {
                book[newIndex++] = this.book[oldIndex];
                isDeleted = true;
            }
        }
        book = Arrays.copyOf(book, newIndex);
        System.out.println(Arrays.toString(book));
        return isDeleted;
    }



}