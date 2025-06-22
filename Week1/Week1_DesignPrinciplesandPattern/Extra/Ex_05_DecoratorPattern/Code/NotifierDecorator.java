package Week1_DesignPrinciplesandPattern.Extra.Ex_05_DecoratorPattern.Code;


public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);  
    }
}
