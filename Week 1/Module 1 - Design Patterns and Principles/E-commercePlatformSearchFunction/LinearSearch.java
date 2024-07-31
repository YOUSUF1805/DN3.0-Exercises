// SearchAlgorithms.java

import java.util.Scanner;

public class LinearSearch {

    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
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
        int searchId = s.nextInt();  // Product ID to search for
        Product foundProduct = linearSearch(products, searchId);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
}
