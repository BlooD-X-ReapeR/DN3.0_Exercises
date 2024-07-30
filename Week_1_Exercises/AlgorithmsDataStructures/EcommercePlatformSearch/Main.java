import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Shampoo", "Health"),
            new Product("2", "Soap", "Health"),
            new Product("3", "Laptop", "Electronics")
        };

        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

        // Linear Search
        Product foundProduct = searchAlgorithms.linearSearch(products, "Soap");
        System.out.println("Found Product (Linear Search): " + foundProduct);

        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        
        // Binary Search
        foundProduct = searchAlgorithms.binarySearch(products, "Laptop");
        System.out.println("Found Product (Binary Search): " + foundProduct);
    }
}
