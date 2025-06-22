package Week1_DesignPrinciplesandPattern.Extra.Ex_11_DependencyInjection.Code;


public interface CustomerRepository {
    Customer findCustomerById(String id);
}

