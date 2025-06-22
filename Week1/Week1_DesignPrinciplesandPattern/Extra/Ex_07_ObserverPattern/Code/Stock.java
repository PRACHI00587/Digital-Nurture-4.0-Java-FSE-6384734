package Week1_DesignPrinciplesandPattern.Extra.Ex_07_ObserverPattern.Code;


public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

