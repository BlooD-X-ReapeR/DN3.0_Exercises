import java.util.Arrays;

public class SearchAlgorithms {

    public Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearch(Book[] books, String title) {
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareTo(title);

            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return books[mid];
            }
        }
        return null;
    }
}
