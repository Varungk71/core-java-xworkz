package com.xworkz.library.impl;

import com.xworkz.library.abstraction.Library;
import com.xworkz.library.constant.BookType;
import com.xworkz.library.dto.BookDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter



public class CentralLibraryImpl implements Library {
    public BookDTO[] book;
    int index;
    int id = 0;

    public CentralLibraryImpl(int size) {
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
        for (int bookIndex = 0; bookIndex < book.length; bookIndex++)
        {
            System.out.println("the book details are ");
            System.out.println(book[bookIndex]);
        }
    }

    @Override
    public String getBookNameByBookid(int bookId) {
        String bookName = null;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookId() == bookId) {
                bookName = book[index].getBookName();
            }

        }
        return bookName;
    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublication) {
       BookDTO[] newBook=new BookDTO[index];
        for (int oldiIndex = 0 ,newIndex=0; oldiIndex < book.length; oldiIndex++) {
            if (book[oldiIndex].getPublishedYear() == yearOfPublication) {
                newBook[newIndex++]=book[oldiIndex];
            }
        }
        return newBook;
    }

    @Override
    public BookDTO[] getBookByBookAuthor(String author) {
        BookDTO[] authorBook=new BookDTO[index];
        for (int oldiIndex = 0 ,newIndex=0; oldiIndex < book.length; oldiIndex++) {
            if (book[oldiIndex].getBookAuthor().equals(author)) {
                authorBook[newIndex++]=book[oldiIndex];
            }
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
    public String getBooknameByYearOfPublication(int bookId) {
        String bookName = null;
        for (int index = 0; index < book.length; index++) {
            if (book[index].getBookId() == bookId) {
                bookName = book[index].getBookName();
            }
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
        public boolean updatePublisherByAuthor (String updatedPublisher, String existingAuthor)
        {
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
        public boolean deleteBookByBookId ( int bookId)
        {
            boolean isDeleted = false;
            int newIndex, oldIndex;
            for (oldIndex = 0, newIndex = 0; oldIndex < book.length; oldIndex++) {
                if (!(book[oldIndex].getBookId() == bookId)) {
                    book[newIndex++] = this.book[oldIndex];
                    isDeleted = true;
                }
            }
            book= Arrays.copyOf(book,newIndex);
            System.out.println(Arrays.toString(book));
            return isDeleted;
        }
    }
