import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    private Map<Integer, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found in the inventory.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found in the inventory.");
        }
    }

    public Product getProduct(int productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Display a product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a product
                    System.out.print("Enter product ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double addPrice = scanner.nextDouble();
                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    // Update a product
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (inventory.getProduct(updateId) != null) {
                        System.out.print("Enter new product name: ");
                        String updateName = scanner.nextLine();
                        System.out.print("Enter new product quantity: ");
                        int updateQuantity = scanner.nextInt();
                        System.out.print("Enter new product price: ");
                        double updatePrice = scanner.nextDouble();
                        Product updatedProduct = new Product(updateId, updateName, updateQuantity, updatePrice);
                        inventory.updateProduct(updatedProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    // Delete a product
                    System.out.print("Enter product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    inventory.deleteProduct(deleteId);
                    break;

                case 4:
                    // Display a product
                    System.out.print("Enter product ID to display: ");
                    int displayId = scanner.nextInt();
                    Product product = inventory.getProduct(displayId);
                    if (product != null) {
                        System.out.println("Product ID: " + product.getProductId() +
                                ", Name: " + product.getProductName() +
                                ", Quantity: " + product.getQuantity() +
                                ", Price: $" + product.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    // Exit
                    running = false;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
