package Week1_DesignPrinciplesandPattern.Extra.Ex_04_AdapterPattern.Code;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

