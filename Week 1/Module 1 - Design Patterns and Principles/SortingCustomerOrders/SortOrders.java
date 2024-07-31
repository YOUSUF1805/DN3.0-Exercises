public class SortOrders {

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // If no elements were swapped, the array is sorted
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);  // Recursively sort left partition
            quickSort(orders, pi + 1, high); // Recursively sort right partition
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high]; // Choose the last element as pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot.getTotalPrice()) {
                i++;

                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swap orders[i + 1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1; // Return the partitioning index
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 99.99),
            new Order(3, "Charlie", 450.00),
            new Order(4, "Diana", 120.50),
            new Order(5, "Eve", 300.25)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Sorting using Bubble Sort
        bubbleSort(orders);

        System.out.println("\nOrders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Resetting the orders array to original unsorted state
        orders = new Order[]{
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 99.99),
            new Order(3, "Charlie", 450.00),
            new Order(4, "Diana", 120.50),
            new Order(5, "Eve", 300.25)
        };

        // Sorting using Quick Sort
        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nOrders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
