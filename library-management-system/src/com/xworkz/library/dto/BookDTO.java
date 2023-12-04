package com.xworkz.library.dto;

import com.xworkz.library.constant.BookType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString

public class BookDTO
{

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private BookType type;
    private int noOfPage;
    private String publication;
    private double price;
    private int publishedYear;

}
