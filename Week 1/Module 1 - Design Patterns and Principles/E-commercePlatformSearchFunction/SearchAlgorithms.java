// SearchAlgorithms.java
import java.util.*;
public class SearchAlgorithms {

    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            }

            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", 10, 999.99),
            new Product(2, "Smartphone", 25, 499.99),
            new Product(3, "Tablet", 15, 299.99),
            new Product(4, "Monitor", 20, 199.99),
            new Product(5, "Keyboard", 30, 49.99)
        };
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Search Id:");
        int searchId = s.nextInt(); // Product ID to search for
        Product foundProduct = binarySearch(products, searchId);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
}
