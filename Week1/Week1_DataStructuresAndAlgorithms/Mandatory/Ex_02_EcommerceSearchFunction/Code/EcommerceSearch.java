import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }


    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " - " + category;
    }
}

public class EcommerceSearch {

    
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) return products[mid];
            else if (products[mid].productId < targetId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shampoo", "Personal Care"),
            new Product(150, "Mobile", "Electronics"),
            new Product(320, "Shoes", "Footwear"),
            new Product(178, "Notebook", "Stationery")
        };

        Scanner sc = new Scanner(System.in);

        // Linear Search
        System.out.print("Enter product name to search (Linear): ");
        String name = sc.nextLine();
        Product foundByName = linearSearch(products, name);
        System.out.println(foundByName != null ? "Found: " + foundByName : "Product not found");

        
        Arrays.sort(products);

        // Binary Search
        System.out.print("Enter product ID to search (Binary): ");
        int id = sc.nextInt();
        Product foundById = binarySearch(products, id);
        System.out.println(foundById != null ? "Found: " + foundById : "Product not found");

        sc.close();
    }
}

