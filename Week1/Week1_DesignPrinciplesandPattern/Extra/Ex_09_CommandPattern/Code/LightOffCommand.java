package Week1_DesignPrinciplesandPattern.Extra.Ex_09_CommandPattern.Code;


public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

