public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Data Structures", "Jane Smith"));
        library.addBook(new Book(3, "Algorithms", "Emily Johnson"));
        library.addBook(new Book(4, "Database Systems", "Michael Brown"));

        System.out.println("All Books:");
        library.printAllBooks();

        // Linear Search
        System.out.println("\nLinear Search for 'Data Structures':");
        Book book = library.linearSearchByTitle("Data Structures");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

        // Sorting books for binary search
        library.sortBooksByTitle();
        System.out.println("\nBooks Sorted by Title:");
        library.printAllBooks();

        // Binary Search
        System.out.println("\nBinary Search for 'Algorithms':");
        book = library.binarySearchByTitle("Algorithms");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}

