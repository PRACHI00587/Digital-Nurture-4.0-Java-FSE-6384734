package Week1_DesignPrinciplesandPattern.Extra.Ex_05_DecoratorPattern.Code;


public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); 
        sendSMS(message);     
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

