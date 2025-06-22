package Week1_DataStructuresAndAlgorithms.Mandatory.Ex_02_EcommerceSearchFunction.Code;


import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

   
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }


    public static Product binarySearch(Product[] products, String targetName) {
       
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = targetName.compareToIgnoreCase(products[mid].productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
