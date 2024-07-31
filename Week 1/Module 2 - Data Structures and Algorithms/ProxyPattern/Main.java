public class Main {
    public static void main(String[] args) {
        // Create ProxyImage instances
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display images
        System.out.println("First display call:");
        image1.display(); // Loads and displays the image

        System.out.println("\nSecond display call:");
        image1.display(); // Uses cached image

        System.out.println("\nDisplay another image:");
        image2.display(); // Loads and displays another image
    }
}
