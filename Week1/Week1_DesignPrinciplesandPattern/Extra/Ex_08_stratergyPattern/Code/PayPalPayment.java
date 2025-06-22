package Week1_DesignPrinciplesandPattern.Extra.Ex_08_stratergyPattern.Code;


public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal (" + email + ")");
    }
}

