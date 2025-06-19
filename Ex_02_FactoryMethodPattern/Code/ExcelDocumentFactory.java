package Week1_DesignPrinciplesandPattern.Ex_02_FactoryMethodPattern.Code;

// ExcelDocumentFactory.java
public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

