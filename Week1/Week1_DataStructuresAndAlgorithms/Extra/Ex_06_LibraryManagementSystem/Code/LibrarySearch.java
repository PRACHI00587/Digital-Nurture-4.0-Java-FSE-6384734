package Week1_DataStructuresAndAlgorithms.Extra.Ex_06_LibraryManagementSystem.Code;

import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase())); // Sort first

        int low = 0, high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null;
    }
}

