public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("1", "Java Programming", "Author A"),
            new Book("2", "Data Structures", "Author B"),
            new Book("3", "Algorithms", "Author C")
        };

        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

        // Linear Search
        Book foundBook = searchAlgorithms.linearSearch(books, "Data Structures");
        System.out.println("Found Book (Linear Search): " + foundBook);

        // Binary Search
        foundBook = searchAlgorithms.binarySearch(books, "Java Programming");
        System.out.println("Found Book (Binary Search): " + foundBook);
    }
}
