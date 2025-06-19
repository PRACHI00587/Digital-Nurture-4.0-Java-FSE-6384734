package Week1_DesignPrinciplesandPattern.Ex_02_FactoryMethodPattern.Code;

// ExcelDocument.java
public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}

