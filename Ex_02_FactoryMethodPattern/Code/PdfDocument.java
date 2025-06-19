package Week1_DesignPrinciplesandPattern.Ex_02_FactoryMethodPattern.Code;

// PdfDocument.java
public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

