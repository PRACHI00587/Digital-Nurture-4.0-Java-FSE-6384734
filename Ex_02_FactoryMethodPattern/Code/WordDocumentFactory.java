package Week1_DesignPrinciplesandPattern.Ex_02_FactoryMethodPattern.Code;

// WordDocumentFactory.java
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

