package Behavioral.Command;

import java.util.Arrays;

public class RemoteControll {
    private Command[] onCommands;
    private Command[] offCommands;
    public RemoteControll() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }
    public void addCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }
    public void onPressed(int index){
        onCommands[index].execute();
    }
    public void offPressed(int index){
        offCommands[index].execute();
    }

    @Override
    public String toString() {
        return "RemoteControll{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
