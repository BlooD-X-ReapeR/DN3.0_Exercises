import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
        } else {
            System.out.println("Product with ID " + product.getProductId() + " not found.");
        }
    }

    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public Product searchProduct(String productId) {
        return products.get(productId);
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
}
