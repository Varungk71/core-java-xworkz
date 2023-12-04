package bookdto;

import constant.BookType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BookDto implements Comparable<BookDto>
{
    private int bookId;
    private String bookname;
    private String author;
    private BookType type;
    private int noOfPage;
    private String publication;
    private double price;
    private int publishedYear;

    @Override
    public int compareTo(BookDto o) {
        return this.bookId-o.bookId;
    }
}
