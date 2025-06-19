package Week1_DesignPrinciplesandPattern.Ex_02_FactoryMethodPattern.Code;

// PdfDocumentFactory.java
public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
