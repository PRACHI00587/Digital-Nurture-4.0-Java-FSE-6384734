package Week1_DesignPrinciplesandPattern.Extra.Ex_11_DependencyInjection.Code;


public class Main {
    public static void main(String[] args) {
       
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.displayCustomer("C1024");
    }
}

