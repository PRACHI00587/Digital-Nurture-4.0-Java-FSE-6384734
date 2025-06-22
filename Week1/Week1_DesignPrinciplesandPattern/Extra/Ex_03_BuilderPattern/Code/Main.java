package Week1_DesignPrinciplesandPattern.Extra.Ex_03_BuilderPattern.Code;


public class Main {
    public static void main(String[] args) {
       
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.displayConfig();
        System.out.println();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setGraphicsCard(false)
                .build();

        System.out.println("Office PC Configuration:");
        officePC.displayConfig();
    }
}



