import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        customerDatabase.put(1, new Customer(1, "John Doe"));
        customerDatabase.put(2, new Customer(2, "Jane Smith"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDatabase.get(id);
    }
}
