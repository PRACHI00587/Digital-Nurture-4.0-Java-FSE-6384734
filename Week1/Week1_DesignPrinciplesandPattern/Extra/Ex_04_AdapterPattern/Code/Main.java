package Week1_DesignPrinciplesandPattern.Extra.Ex_04_AdapterPattern.Code;


public class Main {
    public static void main(String[] args) {
    
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(1500.00);

        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(2200.50);
    }
}

