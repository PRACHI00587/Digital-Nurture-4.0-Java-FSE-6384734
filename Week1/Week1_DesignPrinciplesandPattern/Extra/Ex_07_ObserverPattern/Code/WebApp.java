package Week1_DesignPrinciplesandPattern.Extra.Ex_07_ObserverPattern.Code;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("💻 " + name + " received stock update: ₹" + price);
    }
}

