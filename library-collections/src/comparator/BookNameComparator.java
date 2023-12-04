package comparator;

import bookdto.BookDto;

import java.util.Comparator;

public class BookNameComparator implements Comparator<BookDto> {
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getBookname().compareTo(o2.getBookname());
    }
}
