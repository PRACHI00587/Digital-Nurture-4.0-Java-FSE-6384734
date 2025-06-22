package Week1_DesignPrinciplesandPattern.Extra.Ex_11_DependencyInjection.Code;


public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
       
        return new Customer(id, "Prachi Panigrahi");
    }
}

