package comparator;

import bookdto.BookDto;

import java.util.Comparator;

public class PublicationComparator implements Comparator<BookDto>
{
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getPublication().compareTo(o2.getPublication());
    }
}
