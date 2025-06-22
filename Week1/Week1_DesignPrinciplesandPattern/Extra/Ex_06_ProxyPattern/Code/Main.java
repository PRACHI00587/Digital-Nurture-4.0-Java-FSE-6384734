package Week1_DesignPrinciplesandPattern.Extra.Ex_06_ProxyPattern.Code;


public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("dog.jpg");

        System.out.println("First call:");
        image1.display(); 

        System.out.println("\nSecond call:");
        image1.display(); 

        System.out.println("\nCreating second image object:");
        Image image2 = new ProxyImage("cat.jpg");
        image2.display();
    }
}

