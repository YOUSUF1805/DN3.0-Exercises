public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // For demonstration, return a dummy customer
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
