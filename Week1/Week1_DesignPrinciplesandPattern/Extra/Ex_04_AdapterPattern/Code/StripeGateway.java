package Week1_DesignPrinciplesandPattern.Extra.Ex_04_AdapterPattern.Code;

public class StripeGateway {
    public void makeStripePayment(double value) {
        System.out.println("Paid ₹" + value + " using Stripe.");
    }
}

