import java.util.Arrays;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear search method
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search method (requires sorted array by title)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, (b1, b2) -> b1.title.compareToIgnoreCase(b2.title));
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
