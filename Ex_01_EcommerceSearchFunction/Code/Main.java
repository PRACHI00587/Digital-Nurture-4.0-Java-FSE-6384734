package Week1_DataStructuresAndAlgorithms.Ex_01_EcommerceSearchFunction.Code;

// Main.java
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "T-shirt", "Clothing")
        };

        String searchTerm = "Mobile";

        System.out.println("🔍 Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, searchTerm);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product result2 = SearchEngine.binarySearch(products, searchTerm);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}


