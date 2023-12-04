package com.xworkz.library.abstraction;

import com.xworkz.library.constant.BookType;
import com.xworkz.library.dto.BookDTO;
import com.xworkz.library.exception.BookNotFoundException;

public interface Library
{
    public boolean addBook(BookDTO dto);
    public void getAllBooks();
    public String getBookNameByBookid(int bookId) throws BookNotFoundException;
    public BookDTO[] getBookByYear(int yearOfPublication);
    public BookDTO[] getBookByBookAuthor(String author);
    public BookDTO getBookByBookPublication(String publication);
    public String getBooknameByBookType(BookType type);
    public double getBookPriceByBookName(String bookName);
    public String[] getBooknameByYearOfPublication(int yearOfpublish);
    public boolean updateBookPageByBookId(int UpdatedPage , int bookId);
    public boolean updateBookPriceByBookId(int UpdatedPrice,int bookId);
    public boolean updatePublisherByAuthor(String existingAuthor,String updatedPublisher);
    public boolean deleteBookByBookId(int bookId);

}
