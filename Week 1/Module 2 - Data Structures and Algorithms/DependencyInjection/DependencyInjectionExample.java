public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Find a customer by ID
        Customer customer = customerService.getCustomerById("123");

        // Display customer details
        System.out.println(customer);
    }
}
