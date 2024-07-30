public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel Core i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA GeForce RTX 3080")
            .setOS("Windows 10")
            .build();

        Computer officeComputer = new Computer.Builder()
            .setCPU("Intel Core i5")
            .setRAM("16GB")
            .setStorage("500GB SSD")
            .setOS("Windows 10")
            .build();

        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingComputer);

        System.out.println("\nOffice Computer Configuration:");
        System.out.println(officeComputer);
    }
}
