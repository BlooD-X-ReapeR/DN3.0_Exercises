public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("1", "Toothbrush", 100, 2.99);
        Product product2 = new Product("2", "Toothpaste", 50, 1.49);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("Products in inventory:");
        inventory.displayAllProducts();

        // Updating a product
        Product updatedProduct1 = new Product("1", "Electric Toothbrush", 80, 39.99);
        inventory.updateProduct(updatedProduct1);

        System.out.println("\nAfter updating product 1:");
        inventory.displayAllProducts();

        // Deleting a product
        inventory.deleteProduct("2");

        System.out.println("\nAfter deleting product 2:");
        inventory.displayAllProducts();
    }
}
