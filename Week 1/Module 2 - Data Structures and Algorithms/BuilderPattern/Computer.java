public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String motherboard;

    // Private constructor to enforce the use of the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.motherboard = builder.motherboard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
               ", GPU=" + GPU + ", Motherboard=" + motherboard + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String motherboard;

        // Method to set CPU
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        // Method to set RAM
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        // Method to set Storage
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // Method to set GPU
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        // Method to set Motherboard
        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        // Build method to return a new Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
