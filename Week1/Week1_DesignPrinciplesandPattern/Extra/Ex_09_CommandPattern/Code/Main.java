package Week1_DesignPrinciplesandPattern.Extra.Ex_09_CommandPattern.Code;


public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command turnOn = new LightOnCommand(livingRoomLight);
        Command turnOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Turning light ON:");
        remote.setCommand(turnOn);
        remote.pressButton();

        System.out.println("\nTurning light OFF:");
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}

