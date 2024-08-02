package Behavioral.Command;

public class TurnOnTV implements Command{
   private TV tv;
   public TurnOnTV(TV tv){
       this.tv = tv;
   }
    @Override
    public void execute() {
       this.tv.turnOn();
    }

    @Override
    public void undo() {
       this.tv.turnOff();
    }
}
