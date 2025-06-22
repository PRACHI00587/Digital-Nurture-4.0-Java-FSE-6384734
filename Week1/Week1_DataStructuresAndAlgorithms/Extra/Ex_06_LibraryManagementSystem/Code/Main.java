package Week1_DataStructuresAndAlgorithms.Extra.Ex_06_LibraryManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Data Structures", "Mark Weiss"),
            new Book(2, "Operating Systems", "Galvin"),
            new Book(3, "Algorithms", "CLRS"),
            new Book(4, "Computer Networks", "Tanenbaum"),
            new Book(5, "Java Programming", "Herbert Schildt")
        };

        String searchTitle = "Algorithms";

        System.out.println("🔍 Linear Search:");
        Book b1 = LibrarySearch.linearSearch(books, searchTitle);
        System.out.println(b1 != null ? b1 : "Book not found");

        System.out.println("\n🔍 Binary Search:");
        Book b2 = LibrarySearch.binarySearch(books, searchTitle);
        System.out.println(b2 != null ? b2 : "Book not found");
    }
}

