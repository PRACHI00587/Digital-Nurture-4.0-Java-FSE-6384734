package Week1_DesignPrinciplesandPattern.Extra.Ex_11_DependencyInjection.Code;

public class CustomerService {
    private final CustomerRepository customerRepository;

  
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Customer Name : " + customer.getName());
    }
}

