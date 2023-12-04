package comparator;

import bookdto.BookDto;

import java.util.Comparator;

public class AuthorComparator implements Comparator<BookDto> {
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
