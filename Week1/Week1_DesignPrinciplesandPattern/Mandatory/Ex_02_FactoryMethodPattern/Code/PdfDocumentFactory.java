package Week1_DesignPrinciplesandPattern.Mandatory.Ex_02_FactoryMethodPattern.Code;


public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
