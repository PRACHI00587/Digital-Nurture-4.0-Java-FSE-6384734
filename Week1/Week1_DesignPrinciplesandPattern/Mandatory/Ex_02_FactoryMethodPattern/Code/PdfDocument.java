package Week1_DesignPrinciplesandPattern.Mandatory.Ex_02_FactoryMethodPattern.Code;


public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

