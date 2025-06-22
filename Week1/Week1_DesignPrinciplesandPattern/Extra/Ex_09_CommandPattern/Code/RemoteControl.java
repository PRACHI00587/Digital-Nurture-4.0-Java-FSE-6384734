package Week1_DesignPrinciplesandPattern.Extra.Ex_09_CommandPattern.Code;


public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned.");
        }
    }
}

