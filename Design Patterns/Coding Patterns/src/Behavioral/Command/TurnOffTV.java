package Behavioral.Command;

public class TurnOffTV implements Command {
    private TV tv;
    public  TurnOffTV(TV tv) {
        this.tv=tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
}
