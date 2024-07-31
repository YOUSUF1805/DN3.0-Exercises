public class Main {
    public static void main(String[] args) {
        // Create a basic Computer configuration
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();
        
        System.out.println("Basic Computer Configuration:");
        System.out.println(basicComputer);

        // Create a high-end Computer configuration
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .setMotherboard("ASUS ROG")
            .build();

        System.out.println("\nGaming Computer Configuration:");
        System.out.println(gamingComputer);
    }
}
