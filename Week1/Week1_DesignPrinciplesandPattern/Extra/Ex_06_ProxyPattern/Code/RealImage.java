package Week1_DesignPrinciplesandPattern.Extra.Ex_06_ProxyPattern.Code;


public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading image from server: " + filename);
       
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

