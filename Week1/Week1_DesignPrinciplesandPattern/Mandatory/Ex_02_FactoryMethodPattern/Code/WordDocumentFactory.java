package Week1_DesignPrinciplesandPattern.Mandatory.Ex_02_FactoryMethodPattern.Code;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

