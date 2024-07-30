public class ComputerBuilder {
    private String CPU;
    private String RAM;
    private String Storage;
    private String GPU;
    private String OS;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(String Storage) {
        this.Storage = Storage;
        return this;
    }

    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public ComputerBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    private static class Computer {
        private final String CPU;
        private final String RAM;
        private final String Storage;
        private final String GPU;
        private final String OS;

        private Computer(ComputerBuilder builder) {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.Storage = builder.Storage;
            this.GPU = builder.GPU;
            this.OS = builder.OS;
        }

        @Override
        public String toString() {
            return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage + ", GPU=" + GPU + ", OS=" + OS + "]";
        }
    }
}
