public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 200.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0)
        };

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        // sorted based on Total price

        // Bubble Sort
        sortingAlgorithms.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        sortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
