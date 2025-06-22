package Week1_DesignPrinciplesandPattern.Extra.Ex_04_AdapterPattern.Code;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makeStripePayment(amount); 
    }
}

