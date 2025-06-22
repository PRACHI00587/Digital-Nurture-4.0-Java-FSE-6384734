package Week1_DesignPrinciplesandPattern.Extra.Ex_08_stratergyPattern.Code;


public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

      
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876", "Prachi"));
        context.pay(2500.00);

      
        context.setPaymentStrategy(new PayPalPayment("prachi@example.com"));
        context.pay(1499.50);
    }
}

