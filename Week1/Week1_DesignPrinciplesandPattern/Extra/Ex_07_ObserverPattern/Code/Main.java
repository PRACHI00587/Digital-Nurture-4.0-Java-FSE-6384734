package Week1_DesignPrinciplesandPattern.Extra.Ex_07_ObserverPattern.Code;


public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Prachi's Mobile");
        Observer webUser = new WebApp("Investor Web");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        market.setStockPrice(1123.75);  

        market.removeObserver(webUser);

        market.setStockPrice(1170.90);  
    }
}

