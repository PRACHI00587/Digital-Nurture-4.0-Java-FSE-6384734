package Week1_DesignPrinciplesandPattern.Extra.Ex_05_DecoratorPattern.Code;


public class Main {
    public static void main(String[] args) {
       
        Notifier notifier = new EmailNotifier();

       
        Notifier decoratedNotifier = new SlackNotifierDecorator(
                                        new SMSNotifierDecorator(
                                            notifier));

        decoratedNotifier.send("Hello, this is an important alert!");
    }
}

